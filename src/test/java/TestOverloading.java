import org.junit.Test;

import java.util.logging.Logger;

public class TestOverloading {
    Logger logger = Logger.getLogger(Inner.class.toString());

    @Test
    public void merge() {
        Inner inner = new Inner(1, 1);
        inner.setX("1000");
        logger.info(inner.getX() + "");

        inner.setX(100);
        logger.info(inner.getX() + "");
    }

    public static class Inner {
        private int x;
        private int y;

        public Inner() {
        }

        public Inner(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int setX(String value) {
            x = Integer.valueOf(value);
            return x;
        }

        public String setX(int value) {
            x = value;
            return String.valueOf(value);
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}
