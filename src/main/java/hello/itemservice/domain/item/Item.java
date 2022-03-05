package hello.itemservice.domain.item;

import lombok.Data;

@Data
// @ScriptAssert(lang = "javascript", script = "_this.price * _this.quantity >= 10000" , message = "총합이 10000원 이상")
public class Item {

    //    // @NotNull(groups = UpdateCheck.class)
    private Long id;

    //    // @NotBlank(groups = {UpdateCheck.class, SavedCheck.class})
    private String itemName;

    //    // @NotNull(groups = {UpdateCheck.class, SavedCheck.class})
    // @Range(min = 1000, max = 1000000, groups = {UpdateCheck.class, SavedCheck.class})
    private Integer price;

    // @NotNull(groups = {UpdateCheck.class, SavedCheck.class})
    // @Max(value = 9999, groups = SavedCheck.class)
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
