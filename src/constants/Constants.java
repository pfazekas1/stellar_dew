package constants;

import java.awt.*;

public final class Constants {
    private Constants() {
    }
    public static final int GAME_WIDTH = 1600;
    public static final int GAME_HEIGHT = 800;
    public static final Color BACKGROUND_COLOR = new Color(0xDDEEFF);
    public static final Color TEXT_COLOR = Color.BLACK;
    public static final Font MAIN_FONT = new Font("Monospaced", Font.BOLD, 48);
    public static final Font SMALL_FONT = MAIN_FONT.deriveFont(Font.BOLD, 18);
    public static final Color TITLE_BG_COLOR = Color.WHITE;
    public static final int TITLE_POS_X = 500;
    public static final int TITLE_POS_Y = 100;
}
