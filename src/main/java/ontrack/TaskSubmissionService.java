package ontrack;

public class TaskSubmissionService {

    public String submitTask(String studentId, int taskNumber, String filePath) {

        if (studentId == null || studentId.trim().isEmpty()) {
            return "ERROR: Invalid student ID";
        }

        if (taskNumber <= 0) {
            return "ERROR: Invalid task number";
        }

        if (filePath == null || filePath.trim().isEmpty()) {
            return "ERROR: Invalid file path";
        }

        return "SUCCESS";
    }
}
