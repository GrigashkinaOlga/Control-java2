import control.Controller;
// import fileio.FileBase;
// import fileio.TextFile;
import view.AnsiView;
// import view.View;

// import java.util.List;

public class main {
    public static void main(String[] args)
    {
        Controller controller = new Controller(new AnsiView());
        controller.run();
    }
}
