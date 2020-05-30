package com.barogo.nkakao.domain.out;


import org.springframework.data.elasticsearch.annotations.Document;

/**
 * 응답 도메인
 * @author Thesun
 * @version 0.0.1
 */
@Document(indexName = "nkakao", type = "message")
public class ELResponseVO<T> {

    private Object hits;

    private Object aggregations;

    public String getAggregations() {
        return aggregations.toString();
    }

    public void setAggregations(Object aggregations) {
        this.aggregations = aggregations;
    }
}
