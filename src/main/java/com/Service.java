package com;

public class Service {

    private Repository repository;

    public int calculateSumArray(int[] arrayNumber){
        int sum = 0;
        for(int number: arrayNumber){
            sum = sum + number;
        }
        return sum;
    }

    public int calculateSumArrayUsingRepo(){
        int sum = 0;
        int[] array = repository.getSomeData();
        for(int number: array){
            sum = sum + number;
        }
        return sum;
    }

    public Repository getRepository() {
        return repository;
    }

    public void setRepository(Repository repository) {
        this.repository = repository;
    }
}
