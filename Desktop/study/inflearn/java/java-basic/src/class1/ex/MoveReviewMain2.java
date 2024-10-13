package class1.ex;

public class MoveReviewMain2 {
    public static void main(String[] args) {
        MoveReview[] reviews = new MoveReview[2];

        MoveReview inception = new MoveReview();
        inception.title = "인셉션";
        inception.review = "좋아요";
        reviews[0] = inception;

        MoveReview aboutTime = new MoveReview();
        aboutTime.title = "이이이";
        aboutTime.review = "악";
        reviews[1] = aboutTime;

        for (MoveReview review : reviews){
            System.out.println("영화제목: " + review.title + "리뷰: " + review.review);
        }
    }
}
