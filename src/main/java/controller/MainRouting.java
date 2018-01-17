//package controller;
//
//import model.RacingGame;
//
//import static spark.Spark.get;
//
//public class MainRouting {
//    private RacingGame racingGame;
//    public MainRouting(RacingGame racingGame) {
//        this.racingGame = racingGame;
//    }
//
//    public static void onGame() {
//        get("/game", (req, res) -> "Game");
//    }
//
//    public static void onIndex() {
//        get("/index", (req, res) -> "Index");
//    }
//
//    public static void onResult() {
//        get("/result", (req, res) -> "Result");
//    }
//}
