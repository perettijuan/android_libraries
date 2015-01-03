package com.jpp.androidchallenge.model;

import android.database.Cursor;

import com.jpp.androidchallenge.provider.AndroidChallengeContract;

/**
 * Abstraction that represents a task in the agenda.
 */
public class Task {


    private TaskColor mTaskColor;
    private String mTask;


    public TaskColor getTaskColor() {
        return mTaskColor;
    }

    public String getTask() {
        return mTask;
    }


    /**
     * Creates a Task instance from a given cursor.
     */
    public static Task fromCursor(Cursor cursor) {
        Task task = new Task();
        task.mTask = cursor.getString(cursor.getColumnIndex(AndroidChallengeContract.Tasks.TASK_DEFINITION));
        int colorIdentifier = cursor.getInt(cursor.getColumnIndex(AndroidChallengeContract.Tasks.TASK_COLOR_IDENTIFIER));
        task.mTaskColor = TaskColor.getFromIdentifier(colorIdentifier);
        return task;
    }


    /**
     * Creates a new instance of Task with the given data.
     *
     * @param taskBody        - the task body text.
     * @param colorIdentifier - the identifier of the Color
     * @return - the newly created instance.
     */
    public static Task newInstance(String taskBody, int colorIdentifier) {
        Task task = new Task();
        task.mTask = taskBody;
        TaskColor color = TaskColor.getFromIdentifier(colorIdentifier);
        task.mTaskColor = color;
        return task;
    }
}
