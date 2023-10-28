public class Main {
    public static void main(String[] args) {
        Post post = new NewPost();
//        ln방식으로 찍기
//        PrintPost printPost = new PrintLnPost(post);
//        한줄로 이어지게 찍기
        PrintPost printPost = new PrintNoLnPost(post);
        printPost.print();
        printPost.print();
    }
}
