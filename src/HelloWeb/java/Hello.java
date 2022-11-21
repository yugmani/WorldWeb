import io.javalin.Javalin;

public class Hello {
    public static void main(String[] args){
        Javalin app = Javalin.create().start(7000);
       //app.get("/", ctx-> ctx.result("Hello Yooog"));
        app.get("/", CakesController::getAllCakes);

        app.get("/cakes/{special}", CakesController::getSpecialCake);

    }
}
