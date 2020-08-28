package cn.edu.guet.mapper;

import cn.edu.guet.model.Card;

import java.util.List;

public interface CardMapper {
    List<Card> getAllCardType();
    void saveCardType(Card card);
    void deleteCardType(String cardId);
    void updateCardType(Card card);
}
