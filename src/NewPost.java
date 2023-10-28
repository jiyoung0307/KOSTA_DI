public class NewPost implements Post {
    private String postData = "This is all post data sample";

    @Override
    public String getAllPosts() {
        return postData;
    }
}
