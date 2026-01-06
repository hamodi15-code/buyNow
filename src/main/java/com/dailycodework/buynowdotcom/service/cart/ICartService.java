package com.dailycodework.buynowdotcom.service.cart;

import com.dailycodework.buynowdotcom.dtos.UserDto;
import com.dailycodework.buynowdotcom.model.Cart;
import com.dailycodework.buynowdotcom.model.User;
import com.dailycodework.buynowdotcom.request.CreateUserRequest;
import com.dailycodework.buynowdotcom.request.UserUpdateRequest;

import java.math.BigDecimal;

public interface ICartService {
    Cart getCart(Long cartId);

    Cart getCartByUserId(Long userId);

    void clearCart(Long cartId);

    Cart initializeNewCartForUser(User user);

    BigDecimal getTotalPrice(Long cartId);
}
