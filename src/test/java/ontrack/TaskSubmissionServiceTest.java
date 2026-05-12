package ontrack;

import org.junit.Test;
import static org.junit.Assert.*;

public class TaskSubmissionServiceTest {

    private TaskSubmissionService service = new TaskSubmissionService();

    @Test
    public void testValidSubmission() {
        String result = service.submitTask("s123456", 1, "assignment1.pdf");
        assertEquals("SUCCESS", result);
    }

    @Test
    public void testEmptyStudentId() {
        String result = service.submitTask("", 1, "assignment1.pdf");
        assertEquals("ERROR: Invalid student ID", result);
    }

    @Test
    public void testNullStudentId() {
        String result = service.submitTask(null, 1, "assignment1.pdf");
        assertEquals("ERROR: Invalid student ID", result);
    }

    @Test
    public void testZeroTaskNumber() {
        String result = service.submitTask("s123456", 0, "assignment1.pdf");
        assertEquals("ERROR: Invalid task number", result);
    }

    @Test
    public void testNegativeTaskNumber() {
        String result = service.submitTask("s123456", -1, "assignment1.pdf");
        assertEquals("ERROR: Invalid task number", result);
    }

    @Test
    public void testEmptyFilePath() {
        String result = service.submitTask("s123456", 1, "");
        assertEquals("ERROR: Invalid file path", result);
    }

    @Test
    public void testNullFilePath() {
        String result = service.submitTask("s123456", 1, null);
        assertEquals("ERROR: Invalid file path", result);
    }
}
