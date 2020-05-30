package com.barogo.nkakao.repository;

import com.barogo.nkakao.domain.out.ELResponseVO;
import com.barogo.nkakao.entity.Message;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

import java.util.List;
import java.util.Optional;

public interface MessageRepository extends ElasticsearchCrudRepository<Message, String> {

    Optional<Message> findById(String id);
    List<Message> findByRoomId(String roomId);
    @Query("{ \"bool\" : { \"must\" : {\"query\" : { \"max\" : { \"field\" : \"id\" } } } } }")
    ELResponseVO getNewId();
    Message findFirstById();
    @Query("{ \"bool\" : { \"must\" : [ { \"query_string\" : { \"query\" : \"?0\", \"fields\" : [ \"roomId\" ] } }, { \"range\" : { \"id\" : { \"from\" : \"?1\", \"to\" : null , \"include_lower\" : false , \"include_upper\" : true } } } ] } }")
    List<Message> updateRoomById(String roomId, String id);
}
