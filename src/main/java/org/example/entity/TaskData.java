package org.example.entity;

import java.util.*;

public class TaskData {
    private Set<Task> annsTasks ;
    private Set<Task> bobsTasks ;
    private Set<Task> carolsTasks ;
    private Set<Task> unassignedTasks ;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getAnnsTasks() {
        return annsTasks;
    }

    public Set<Task> getBobsTasks() {
        return bobsTasks;
    }

    public Set<Task> getCarolsTasks() {
        return carolsTasks;
    }

    public Set<Task> getUnassignedTasks() {
        return unassignedTasks;
    }

    public Set<Task> getTasks(String name){
        switch (name){
            case "ann"-> {
                return  annsTasks;
            }
            case "bob"-> {
                return  bobsTasks;
            }
            case "carol"-> {
                return  carolsTasks;
            }
            case "all" -> {
                Set<Task> allTasks = new HashSet<>();
                allTasks.addAll(annsTasks);
                allTasks.addAll(bobsTasks);
                allTasks.addAll(carolsTasks);
                return allTasks;
            }
            default -> {
               return Collections.emptySet();
            }


        }
    }
    public Set<Task> getUnion(Set<Task>... sets){
        Set<Task> union = new HashSet<>();
        for (Set<Task> set : sets) {
            union.addAll(set);
        }

        return union;
    }
    public Set<Task> getIntersection(Set<Task> tasks1, Set<Task> tasks2){
        Set<Task> intersects = new HashSet<>(tasks1);
        intersects.retainAll(tasks2);
        return intersects;
    }
    public Set<Task> getDifferences(Set<Task> task1, Set<Task> task2){
        Set<Task> difference = new HashSet<>(task1);
        difference.removeAll(task2);
        return difference;

    }
}
