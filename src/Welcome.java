import java.io.*;

public class Welcome {
    public static String name;
    public static String phone;
    static boolean quit = false;

    public static void main(String[] args) throws IOException {
        getInfo();
        setMenu();
    }

    public static void getInfo() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("당신의 이름을 입력하세요 : ");
        name = br.readLine();
        System.out.print("연락처를 입력하세요 : ");
        phone = br.readLine();
    }

    public static void checkNumber() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("메뉴 번호를 선택해주세요 ");
        int num = Integer.parseInt(br.readLine());

        if (num < 1 || num > 8) {
            System.out.println("메뉴는 1번 부터 8번 까지의 숫자로 입력해 주세요!");
            setMenu();
        } else {
            System.out.println(num + "번을 선택했습니다.");
            switch (num) {
                case 1:
                    System.out.println("현재 고객님의 성함 : " + name + " 연락처 : " + phone);
                    break;
                case 2:
                    System.out.println("장바구니 상품 목록 보기");
                    break;
                case 3:
                    System.out.println("장바구니 비우기");
                    break;
                case 4:
                    System.out.println("영수증 표시하기");
                    break;
                case 5:
                    System.out.println("바구니에 항목 추가하기");
                    break;
                case 6:
                    System.out.println("장바구니의 항목 수량 줄이기");
                    break;
                case 7:
                    System.out.println("장바구니의 항목 삭제하기");
                    break;
                case 8:
                    System.out.println("종료");
                    quit = true;
                    System.out.println("온라인 도서몰을 찾아주셔서 감사합니다.");
                    break;
            }
        }
    }

    public static void setMenu() throws IOException {
        String greeting = "Welcome to Shopping Mall";
        String tagline = "Welcome to Book Market!";

        while (!quit) {
            System.out.println("**************************************************");
            System.out.println("\t\t" + greeting);
            System.out.println("\t\t" + tagline);
            System.out.println("**************************************************");
            System.out.println("1. 고객 정보 확인하기\t\t5. 바구니에 항목 추가하기");
            System.out.println("2. 장바구니 상품 목록 보기\t6. 장바구니의 항목 수량 줄이기");
            System.out.println("3. 장바구니 비우기\t\t\t7. 장바구니의 항목 삭제하기");
            System.out.println("4. 영수증 표시하기\t\t\t8. 종료");
            System.out.println("**************************************************");

            checkNumber();
        }

    }
}
