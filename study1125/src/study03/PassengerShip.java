package study03;

import java.util.Scanner;

public class PassengerShip extends Ship {
   
   Scanner scan = new Scanner(System.in);
   
   String shipName; // ���� �̸�
   int maxPassenger; // �ִ� �¼� �ο�
   int maxLuggage; // �ִ� ȭ�� ���緮
   int passenger; // �¼� ��� �ο�
   
   PassengerShip(String name, int maxp, int maxl) { // ���� �̸�, �ִ� �¼� �ο�, �ִ� ȭ�� ���緮 ������ ����
      this.shipName = name;
      this.maxPassenger = maxp;
      this.maxLuggage = maxl;
   }
   
   @Override
   public int luggage() { // Ship Ŭ������ �ִ� luggage �޼ҵ� �������̵�
      return maxLuggage; // �ִ� ȭ�� ���緮 ��ȯ
   }
   
   @Override
   public void setPass() {
      System.out.print("�¼� ��� �ο��� �Է��ϼ���>> ");
      passenger = scan.nextInt();
   }
   
   @Override
   public int passengers() { // Ship Ŭ������ �ִ� passengers �޼ҵ� �������̵�
      
      System.out.println(shipName + " �¼� ��� �ο� : " + passenger +  "��"); // �� �̸��� �¼� ��� �ο� ���
      System.out.println(shipName + " �ִ� ž�� �ο� : " + maxPassenger +"��"); // �� �̸��� �ִ� ž�� �ο� ���
      System.out.println();
      System.out.println("=================");
      System.out.println();
      
      if( passenger > maxPassenger) { // �¼� ��� �ο��� �ִ� ž�� �ο����� ���� ���
         System.out.println("�¼� ���� �ο� " + (passenger-maxPassenger) + "�� �ʰ� !!! �¼� �ο� " + maxPassenger + "������ �����մϴ�."); // �¼� ���� �ο� �ʰ� �� �ִ� �ο����� ���� ���
         return maxPassenger; // �¼� �ο��� maxPassenger������ �����Ͽ� ��ȯ
      }
      else {
         return passenger; // �¼� �ο��� passenger�� ��ȯ
      }
   }

   
}