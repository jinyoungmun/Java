package study03;

import java.util.Scanner;

public class PassengerShip extends Ship {
   
   Scanner scan = new Scanner(System.in);
   
   String shipName; // 배의 이름
   int maxPassenger; // 최대 승선 인원
   int maxLuggage; // 최대 화물 적재량
   int passenger; // 승선 희망 인원
   
   PassengerShip(String name, int maxp, int maxl) { // 배의 이름, 최대 승선 인원, 최대 화물 적재량 생성자 생성
      this.shipName = name;
      this.maxPassenger = maxp;
      this.maxLuggage = maxl;
   }
   
   @Override
   public int luggage() { // Ship 클래스에 있는 luggage 메소드 오버라이드
      return maxLuggage; // 최대 화물 적재량 반환
   }
   
   @Override
   public void setPass() {
      System.out.print("승선 희망 인원을 입력하세요>> ");
      passenger = scan.nextInt();
   }
   
   @Override
   public int passengers() { // Ship 클래스에 있는 passengers 메소드 오버라이드
      
      System.out.println(shipName + " 승선 희망 인원 : " + passenger +  "명"); // 배 이름과 승선 희망 인원 출력
      System.out.println(shipName + " 최대 탑승 인원 : " + maxPassenger +"명"); // 배 이름과 최대 탑승 인원 출력
      System.out.println();
      System.out.println("=================");
      System.out.println();
      
      if( passenger > maxPassenger) { // 승선 희망 인원이 최대 탑승 인원보다 많을 경우
         System.out.println("승선 가능 인원 " + (passenger-maxPassenger) + "명 초과 !!! 승선 인원 " + maxPassenger + "명으로 제한합니다."); // 승선 가능 인원 초과 및 최대 인원으로 제한 출력
         return maxPassenger; // 승선 인원을 maxPassenger값으로 제한하여 반환
      }
      else {
         return passenger; // 승선 인원을 passenger로 반환
      }
   }

   
}