/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author pasindu
 */
public class Backup_Restore {
    public static boolean restoreDB(String dbUserName, String dbPassword, String source) {

        String[] executeCmd = new String[]{"mysql", "--user=" + dbUserName, "--password=" + dbPassword, "-e", "source "+source};

        Process runtimeProcess;
        try {

            runtimeProcess = Runtime.getRuntime().exec(executeCmd);
            int processComplete = runtimeProcess.waitFor();

            if (processComplete == 0) {
                System.out.println("Backup restored successfully");
                return true;
            } else {
                System.out.println("Could not restore the backup");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return false;
    }
    public static boolean backupDB(String dbName, String dbUserName, String dbPassword, String path) {

        String executeCmd = "mysqldump -u " + dbUserName + " -p" + dbPassword + " --add-drop-database -B " + dbName + " -r " + path;
        Process runtimeProcess;
        try {

            runtimeProcess = Runtime.getRuntime().exec(executeCmd);
            int processComplete = runtimeProcess.waitFor();

            if (processComplete == 0) {
                System.out.println("Backup created successfully");
                return true;
            } else {
                System.out.println("Could not create the backup");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return false;
    }
}
