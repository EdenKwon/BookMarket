import java.io.*;

public class Welcome {
    private String name;
    private static int phone;

    public static void main(String[] args) throws IOException {
        getInfo();
        setMenu();
    }

    public static void getInfo() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("당신의 이름을 입력하세요 : ");
        String name = (br.readLine());
        System.out.print("연락처를 입력하세요 : ");
        int phone = Integer.parseInt(br.readLine());
    }

    public static void checkNumber() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("메뉴 번호를 선택해주세요 ");
        int num = Integer.parseInt(br.readLine());

        switch (num) {
            case 1:
                System.out.println("1번을 선택했습니다.");
                break;
            case 2:
                System.out.println("2번을 선택했습니다.");
                break;
            case 3:
                System.out.println("3번을 선택했습니다.");
                break;
            case 4:
                System.out.println("4번을 선택했습니다.");
                break;
            case 5:
                System.out.println("5번을 선택했습니다.");
                break;
            case 6:
                System.out.println("6번을 선택했습니다.");
                break;
            case 7:
                System.out.println("7번을 선택했습니다.");
                break;
            case 8:
                System.out.println("8번을 선택했습니다.");
                break;
            default:
                System.out.println("잘못된 번호를 입력했습니다.");
                setMenu();
        }

        br.close();
    }

    public static void setMenu() throws IOException {
        System.out.println("**************************************************");
        System.out.println("\t\tWelcome to Shopping Mall");
        System.out.println("\t\tWelcome to Book Market!");
        System.out.println("**************************************************");
        System.out.println("1. 고객 정보 확인하기 \t\t4. 바구니에 항목 추가하기");
        System.out.println("2. 장바구니 상품 목록 확인 \t5. 장바구니의 항목 수량 줄이기");
        System.out.println("3. 장바구니 비우기 \t\t\t6. 장바구니의 항목 삭제하기");
        System.out.println("7. 영수증 표시하기 \t\t\t8. 종료");
        System.out.println("**************************************************");

        checkNumber();
    }
}
