package study03;

public class ShipTest {

   public static void main(String[] args) {
      
      PassengerShip ps = new PassengerShip("승리호", 10, 100); // 배 이름 승리호, 최대 인원 10명, 최대 화물 적재량 100kg
      System.out.println("배 이름 : " + ps.shipName); // 배 이름 출력
      ps.setPass();
      System.out.println(ps.shipName + " 현재 탑승 인원 : " + ps.passengers() + "명"); // 배 이름과 현재 탑승 인원 출력
      System.out.println(ps.shipName + " 최대 화물 적재량 : " + ps.luggage() + "kg"); // 최대 화물 적재량 출력

   }

}