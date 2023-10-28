public class PrintLnPost implements PrintPost {
    private Post post;

    public PrintLnPost(Post post) {
        this.post = post;
    }

    @Override
    public void print() {
        System.out.println(post.getAllPosts());
    }
}
