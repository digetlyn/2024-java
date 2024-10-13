package class1.ex;

public class MoveReviewMain1 {
    public static void main(String[] args) {
        MoveReview inception = new MoveReview();
        inception.title = "인셉션";
        inception.review = "좋아요";

        MoveReview aboutTime = new MoveReview();
        aboutTime.title = "이이이";
        aboutTime.review = "악";

        System.out.println("영화제목: " + inception.title + "리뷰: " + inception.review);
        System.out.println("영화제목: " + aboutTime.title + "리뷰: " + aboutTime.review);
    }
}
