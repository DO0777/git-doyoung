package cch208;

public class OrderTest {

	public static void main(String[] args) {

		Order order1 = new Order();
		order1.orderNumber = "7777777";
		order1.customerPhone = "01012345678";
		order1.customerAddress = "서울시 서초구 우면동 한라아파트 105동";
		order1.orderDate = "20220922";
		order1.orderTime = "155422";
		order1.price = 35000;
		order1.menuId = "0001";
		
		order1.showOrderDetail();
	}

}
