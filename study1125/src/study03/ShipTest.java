package study03;

public class ShipTest {

   public static void main(String[] args) {
      
      PassengerShip ps = new PassengerShip("�¸�ȣ", 10, 100); // �� �̸� �¸�ȣ, �ִ� �ο� 10��, �ִ� ȭ�� ���緮 100kg
      System.out.println("�� �̸� : " + ps.shipName); // �� �̸� ���
      ps.setPass();
      System.out.println(ps.shipName + " ���� ž�� �ο� : " + ps.passengers() + "��"); // �� �̸��� ���� ž�� �ο� ���
      System.out.println(ps.shipName + " �ִ� ȭ�� ���緮 : " + ps.luggage() + "kg"); // �ִ� ȭ�� ���緮 ���

   }

}