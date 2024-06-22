import java.io.*;

public class Welcome {
    private static String name;
    private static String phone;
    static boolean quit = false;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        getInfo();
        menuIntroduction();
    }

    public static void menuIntroduction() throws IOException {
        String greeting = "Welcome to Shopping Mall";
        String tagline = "Welcome to Book Market!";

        while (!quit) {
            System.out.println("**************************************************");
            System.out.println("\t\t" + greeting);
            System.out.println("\t\t" + tagline);
            System.out.println("**************************************************");
            System.out.println("1. 고객 정보 확인하기\t\t4. 바구니에 항목 추가하기");
            System.out.println("2. 장바구니 상품 목록 보기\t5. 장바구니의 항목 수량 줄이기");
            System.out.println("3. 장바구니 비우기\t\t\t6. 장바구니의 항목 삭제하기");
            System.out.println("7. 영수증 표시하기\t\t\t8. 종료");
            System.out.println("**************************************************");

            checkNumber();
        }

    }

    public static void setName(String name) {
        Welcome.name = name;
    }

    public static String getName() {
        return Welcome.name;
    }

    public static void setPhone(String phone) {
        Welcome.phone = phone;
    }

    public static String getPhone() {
        return Welcome.phone;
    }

    public static void getInfo() throws IOException {
        System.out.print("당신의 이름을 입력하세요 : ");
        setName(br.readLine());
        System.out.print("연락처를 입력하세요 : ");
        setPhone(br.readLine());
    }

    public static void checkNumber() throws IOException {
        System.out.println();
        System.out.print("메뉴 번호를 선택해주세요 ");
        int num = Integer.parseInt(br.readLine());

        if (num < 1 || num > 8) {
            System.out.println("메뉴는 1번 부터 8번 까지의 숫자로 입력해 주세요!");
            menuIntroduction();
        } else {
            System.out.println(num + "번을 선택했습니다.");
            switch (num) {
                case 1:
                    menuGuestInfo(name, phone);
                    break;
                case 2:
                    menuCartItemList();
                    break;
                case 3:
                    menuCartClear();
                    break;
                case 4:
                    menuCartAddItem();
                    break;
                case 5:
                    menuCartRemoveItemCount();
                    break;
                case 6:
                    menuCartRemoveItem();
                    break;
                case 7:
                    menuCartBill();
                    break;
                case 8:
                    menuExit();
                    break;
            }
        }
    }

    
    public static void menuGuestInfo(String name, String phone) {
        System.out.println("현재 고객님의 성함 : " + name + " 연락처 : " + phone);
    }

    public static void menuCartItemList() {
        System.out.println("장바구니 상품 목록 보기");
    }

    public static void menuCartClear() {
        System.out.println("장바구니 비우기");
    }

    public static void menuCartAddItem() {
        System.out.println("바구니에 항목 추가하기");
    }

    public static void menuCartRemoveItemCount() {
        System.out.println("장바구니의 항목 수량 줄이기");
    }

    public static void menuCartRemoveItem() {
        System.out.println("장바구니의 항목 삭제하기");
    }

    public static void  menuCartBill() {
        System.out.println("영수증 표시하기");
    }

    public static void menuExit() {
        quit = true;
        System.out.println("종료");
        System.out.println("온라인 도서몰을 찾아주셔서 감사합니다.");
    }
}

