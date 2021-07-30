package hello.itemservice.domain.item;

import lombok.AllArgsConstructor;
import lombok.Data;


/**
 * code는 시스템에 전달하는값,
 * displayName은 고객에게 보여주는 값 이다.
 *
 * FAST : 빠른 배송
 * NORMAL : 일반 배송
 * SLOW : 느린 배송
 */

@Data
@AllArgsConstructor
public class DeliveryCode {

    private String code;
    private String displayName;
}
