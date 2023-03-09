import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {

    @Test
    @DisplayName("输入错误")
    void parameters_error_test() {
        Triangle triangle = new Triangle();

        String type = triangle.classify(0, 1, 1);
        assertEquals("输入错误", type);
    }

    @Test
    @DisplayName("输入错误")
    void parameters_error_test() {
        Triangle triangle = new Triangle();

        String type = triangle.classify(1, 0, 1);
        assertEquals("输入错误", type);
    }

    @Test
    @DisplayName("输入错误")
    void parameters_error_test() {
        Triangle triangle = new Triangle();

        String type = triangle.classify(1, 1, 0);
        assertEquals("输入错误", type);
    }

    @Test
    @DisplayName("输入错误")
    void parameters_error_test() {
        Triangle triangle = new Triangle();

        String type = triangle.classify(101, 1, 1);
        assertEquals("输入错误", type);
    }

    @Test
    @DisplayName("输入错误")
    void parameters_error_test() {
        Triangle triangle = new Triangle();

        String type = triangle.classify(1, 101, 1);
        assertEquals("输入错误", type);
    }

    @Test
    @DisplayName("输入错误")
    void parameters_error_test() {
        Triangle triangle = new Triangle();

        String type = triangle.classify(1, 1, 101);
        assertEquals("输入错误", type);
    }

    @Test
    @DisplayName("非三角形")
    void parameters_error_test() {
        Triangle triangle = new Triangle();

        String type = triangle.classify(1, 1, 2);
        assertEquals("非三角形", type);
    }

    @Test
    @DisplayName("非三角形")
    void parameters_error_test() {
        Triangle triangle = new Triangle();

        String type = triangle.classify(1, 2, 1);
        assertEquals("非三角形", type);
    }

    @Test
    @DisplayName("非三角形")
    void parameters_error_test() {
        Triangle triangle = new Triangle();

        String type = triangle.classify(2, 1, 1);
        assertEquals("非三角形", type);
    }

    @Test
    @DisplayName("等边三角形")
    void scalene_test() {
        Triangle triangle = new Triangle();

        String type = triangle.classify(1, 1, 1);
        assertEquals("等边三角形", type);
    }

    @Test
    @DisplayName("等腰三角形")
    void scalene_test() {
        Triangle triangle = new Triangle();

        String type = triangle.classify(2, 2, 1);
        assertEquals("等腰三角形", type);
    }

    @Test
    @DisplayName("等腰三角形")
    void scalene_test() {
        Triangle triangle = new Triangle();

        String type = triangle.classify(2, 1, 2);
        assertEquals("等腰三角形", type);
    }

    @Test
    @DisplayName("等腰三角形")
    void scalene_test() {
        Triangle triangle = new Triangle();

        String type = triangle.classify(1, 2, 2);
        assertEquals("等腰三角形", type);
    }

    @Test
    @DisplayName("直角三角形")
    void scalene_test() {
        Triangle triangle = new Triangle();

        String type = triangle.classify(3, 4, 5);
        assertEquals("直角三角形", type);
    }

    @Test
    @DisplayName("一般三角形")
    void scalene_test() {
        Triangle triangle = new Triangle();

        String type = triangle.classify(2, 4, 3);
        assertEquals("一般三角形", type);
    }
}
