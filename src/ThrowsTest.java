public class ThrowsTest {
    public static void main(String args[]){
        int[] tmp = {1,2,3,4,5};
        try {
            testThrows(tmp);
            System.out.println("정상 실행");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 터짐");
        } catch (Exception e) {
            System.out.println("뭔가 터짐");
        }
        System.out.println("정상 종료");
    }

    private static void testThrows(int[] t) throws ArrayIndexOutOfBoundsException {
        for(int i=0; i<=t.length; i++) { 
            System.out.println(t[i]);
        };
    }
}