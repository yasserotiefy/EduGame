package example.com.teachme.Connection;

import example.com.teachme.Comment.Comment;
import example.com.teachme.api.CommentAPIInterface;
import example.com.teachme.api.CourseAPIInterface;
import example.com.teachme.api.GameAPIInterface;
import example.com.teachme.api.QuestionAPIInterface;
import example.com.teachme.api.UserAPIInterface;
import retrofit2.Retrofit;

public class ApiUtils {

    private ApiUtils() {
    }

    // public static final String BASE_URL = "http://192.168.1.2:8080";
    //private static final String BASE_URL = "http://192.168.1.3:8080";

    // public static final String BASE_URL = "http://10.0.2.2:8080";
    public static final String BASE_URL = "https://cryptic-mountain-28310.herokuapp.com";


    public static CourseAPIInterface getAPICourse() {
        return RetrofitClient.getClient(BASE_URL).create(CourseAPIInterface.class);
    }

    public static UserAPIInterface getAPIUser() {
        return RetrofitClient.getClient(BASE_URL).create(UserAPIInterface.class);
    }

    public static GameAPIInterface getAPIGame() {
        return RetrofitClient.getClient(BASE_URL).create(GameAPIInterface.class);
    }

    public static QuestionAPIInterface getAPIQuestion() {
        return RetrofitClient.getClient(BASE_URL).create(QuestionAPIInterface.class);
    }

    public static CommentAPIInterface getAPIComment() {
        return RetrofitClient.getClient(BASE_URL).create(CommentAPIInterface.class);
    }

    public static CommentAPIInterface getAPICommentObservable() {
        return RetrofitClient.getClientObservable(BASE_URL).create(CommentAPIInterface.class);
    }

}