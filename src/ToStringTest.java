class ToStringTest {

    int x;
    String str;

    public ToStringTest(int x, String str) {
        this.x = x;
        this.str = str;
    }

    public String toString() {
        return x + "년, " + str + "님";
    }

    public static void main(String[] args) {

        ToStringTest tt = new ToStringTest(2022, "이동훈");
        System.out.println(tt);
    }
}