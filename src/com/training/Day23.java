package com.training;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Day23 {
    public static void main(String[] args) {   //Dequeue
        Day23 day23 = new Day23();
        day23.dataDequeue();

    }

    private void addDequeue() {
        Deque<Integer> addDequeue = new ArrayDeque<>();
        addDequeue.add(10);
        addDequeue.add(5);
        addDequeue.add(11);
        addDequeue.add(1);
        System.out.println("Add Dequeue: " + addDequeue);


    }

    private void addFirstDequeue() {
        Deque<Integer> addFirstDequeue = new ArrayDeque<>();
        addFirstDequeue.add(10);
        addFirstDequeue.add(5);
        addFirstDequeue.add(11);
        addFirstDequeue.add(1);
        System.out.println("Regular Dequeue: " + addFirstDequeue);
        addFirstDequeue.addFirst(20);
        System.out.println("Add First Dequeue: " + addFirstDequeue);


    }

    private void addLastDequeue() {
        Deque<Integer> addLastDequeue = new ArrayDeque<>();
        addLastDequeue.add(10);
        addLastDequeue.add(5);
        addLastDequeue.add(11);
        addLastDequeue.add(1);
        System.out.println("Regular Dequeue: " + addLastDequeue);
        addLastDequeue.addLast(20);
        System.out.println("Add Last Dequeue: " + addLastDequeue);


    }

    private void containsDequeue() {
        Deque<Integer> containsDequeue = new ArrayDeque<>();
        containsDequeue.add(10);
        containsDequeue.add(5);
        containsDequeue.add(11);
        containsDequeue.add(1);
        System.out.println("Contains Dequeue: " + containsDequeue.contains(5));
    }

    private void descendingIteratorDequeue() {
        Deque<Integer> descendingIteratorDequeue = new ArrayDeque<>();
        descendingIteratorDequeue.add(10);
        descendingIteratorDequeue.add(5);
        descendingIteratorDequeue.add(11);
        descendingIteratorDequeue.add(1);
        System.out.println("Regular Dequeue: " + descendingIteratorDequeue);
        Iterator<Integer> iterator = descendingIteratorDequeue.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println("Descending Iterator Dequeue: " + iterator.next());
        }


    }

    private void elementDequeue() {
        Deque<Integer> elementDequeue = new ArrayDeque<>();
        elementDequeue.add(10);
        elementDequeue.add(5);
        elementDequeue.add(11);
        elementDequeue.add(1);
        System.out.println("Element Regular Dequeue: " + elementDequeue);
        System.out.println("Element Dequeue: " + elementDequeue.element());
    }

    private void getFirstDequeue() {
        Deque<Integer> getFirstDequeue = new ArrayDeque<>();
        getFirstDequeue.add(10);
        getFirstDequeue.add(5);
        getFirstDequeue.add(11);
        getFirstDequeue.add(1);
        System.out.println("Get First Regular Dequeue: " + getFirstDequeue);
        System.out.println("Get First Dequeue: " + getFirstDequeue.getFirst());
    }

    private void getLastDequeue() {
        Deque<Integer> getLastDequeue = new ArrayDeque<>();
        getLastDequeue.add(10);
        getLastDequeue.add(5);
        getLastDequeue.add(11);
        getLastDequeue.add(1);
        System.out.println("Get Last Regular Dequeue: " + getLastDequeue);
        System.out.println("Get Last Dequeue: " + getLastDequeue.getLast());
    }

    private void iteratorDequeue() {
        PriorityQueue<Integer> iteratorDequeue = new PriorityQueue<>();
        iteratorDequeue.add(10);
        iteratorDequeue.add(5);
        iteratorDequeue.add(11);
        iteratorDequeue.add(1);
        System.out.println("Iterator Dequeue: " + iteratorDequeue);
        Iterator<Integer> iterator = iteratorDequeue.iterator();

        while (iterator.hasNext()) {
            System.out.println("Iterator While Dequeue: " + iterator.next());

        }

    }

    private void offerDequeue() {
        Deque<Integer> offerDequeue = new ArrayDeque<>();
        offerDequeue.add(10);
        offerDequeue.add(5);
        offerDequeue.add(11);
        offerDequeue.add(1);
        System.out.println("Offer Regular Dequeue: " + offerDequeue);
        offerDequeue.offer(20);
        System.out.println("Offer Dequeue: " + offerDequeue);
    }

    private void offerFirstDequeue() {
        Deque<Integer> offerFirstDequeue = new ArrayDeque<>();
        offerFirstDequeue.add(10);
        offerFirstDequeue.add(5);
        offerFirstDequeue.add(11);
        offerFirstDequeue.add(1);
        System.out.println("Offer First Regular Dequeue: " + offerFirstDequeue);
        offerFirstDequeue.offerFirst(20);
        System.out.println("Offer First Dequeue: " + offerFirstDequeue);
    }

    private void offerLastDequeue() {
        Deque<Integer> offerLastDequeue = new ArrayDeque<>();
        offerLastDequeue.add(10);
        offerLastDequeue.add(5);
        offerLastDequeue.add(11);
        offerLastDequeue.add(1);
        System.out.println("Offer Last Regular Dequeue: " + offerLastDequeue);
        offerLastDequeue.offerLast(20);
        System.out.println("Offer Last Dequeue: " + offerLastDequeue);
    }

    private void peekDequeue() {
        Deque<Integer> peekDequeue = new ArrayDeque<>();
        peekDequeue.add(10);
        peekDequeue.add(5);
        peekDequeue.add(11);
        peekDequeue.add(1);
        System.out.println("Peek Regular Dequeue: " + peekDequeue);
        System.out.println("Peek Dequeue: " + peekDequeue.peek());
    }
    private void peekFirstDequeue() {
        Deque<Integer> peekFirstDequeue = new ArrayDeque<>();
        peekFirstDequeue.add(10);
        peekFirstDequeue.add(5);
        peekFirstDequeue.add(11);
        peekFirstDequeue.add(1);
        System.out.println("Peek First Regular Dequeue: " + peekFirstDequeue);
        System.out.println("Peek First Dequeue: " + peekFirstDequeue.peekFirst());
    }
    private void peekLastDequeue() {
        Deque<Integer> peekLastDequeue = new ArrayDeque<>();
        peekLastDequeue.add(10);
        peekLastDequeue.add(5);
        peekLastDequeue.add(11);
        peekLastDequeue.add(1);
        System.out.println("Peek Last Regular Dequeue: " + peekLastDequeue);
        System.out.println("Peek Last Dequeue: " + peekLastDequeue.peekLast());
    }
    private void poolDequeue() {
        Deque<Integer> poolDequeue = new ArrayDeque<>();
        poolDequeue.add(10);
        poolDequeue.add(5);
        poolDequeue.add(11);
        poolDequeue.add(1);
        System.out.println("PooL Regular Dequeue: " + poolDequeue);
        System.out.println("PooL Dequeue: " + poolDequeue.poll());
    }
    private void poolFirstDequeue() {
        Deque<Integer> poolFirstDequeue = new ArrayDeque<>();
        poolFirstDequeue.add(10);
        poolFirstDequeue.add(5);
        poolFirstDequeue.add(11);
        poolFirstDequeue.add(1);
        System.out.println("PooL First Regular Dequeue: " + poolFirstDequeue);
        System.out.println("PooL First Dequeue: " + poolFirstDequeue.pollFirst());
    }
    private void poolLastDequeue() {
        Deque<Integer> poolLastDequeue = new ArrayDeque<>();
        poolLastDequeue.add(10);
        poolLastDequeue.add(5);
        poolLastDequeue.add(11);
        poolLastDequeue.add(1);
        System.out.println("PooL Last Regular Dequeue: " + poolLastDequeue);
        System.out.println("PooL Last Dequeue: " + poolLastDequeue.pollLast());
    }
    private void popDequeue() {
        Deque<Integer> popDequeue = new ArrayDeque<>();
        popDequeue.add(10);
        popDequeue.add(5);
        popDequeue.add(11);
        popDequeue.add(1);
        System.out.println("Pop Regular Dequeue: " + popDequeue);
        System.out.println("Pop Dequeue: " + popDequeue.pop());
        System.out.println("After Pop Dequeue: " + popDequeue);
    }
    private void pushDequeue() {
        Deque<Integer> pushDequeue = new ArrayDeque<>();
        pushDequeue.add(10);
        pushDequeue.add(5);
        pushDequeue.add(11);
        pushDequeue.add(1);
        System.out.println("Push Regular Dequeue: " + pushDequeue);
        pushDequeue.push(26);
        System.out.println("Push Dequeue: " + pushDequeue);
    }
    private void removeDequeue() {
        Deque<Integer> removeDequeue = new ArrayDeque<>();
        removeDequeue.add(10);
        removeDequeue.add(5);
        removeDequeue.add(11);
        removeDequeue.add(1);
        System.out.println("Remove Regular Dequeue: " + removeDequeue);
        removeDequeue.remove();
        removeDequeue.remove(11);
        System.out.println("Remove Dequeue: " + removeDequeue);
    }
    private void removeObjectDequeue() {
        Deque<Integer> removeObjectDequeue = new ArrayDeque<>();
        removeObjectDequeue.add(10);
        removeObjectDequeue.add(5);
        removeObjectDequeue.add(11);
        removeObjectDequeue.add(1);
        System.out.println("Remove Object Regular Dequeue: " + removeObjectDequeue);
        removeObjectDequeue.remove(11);
        System.out.println("Remove Object Dequeue: " + removeObjectDequeue);
    }
    private void removeFirstOccuranceDequeue() {
        Deque<Integer> removeFirstOccuranceDequeue = new ArrayDeque<>();
        removeFirstOccuranceDequeue.add(10);
        removeFirstOccuranceDequeue.add(5);
        removeFirstOccuranceDequeue.add(11);
        removeFirstOccuranceDequeue.add(1);
        System.out.println("Remove First Occurance Regular Dequeue: " + removeFirstOccuranceDequeue);
        removeFirstOccuranceDequeue.removeFirstOccurrence(11);
        System.out.println("Remove First Occurance Dequeue: " + removeFirstOccuranceDequeue);
    }
    private void removeFirstDequeue() {
        Deque<Integer> removeFirstDequeue = new ArrayDeque<>();
        removeFirstDequeue.add(10);
        removeFirstDequeue.add(5);
        removeFirstDequeue.add(11);
        removeFirstDequeue.add(1);
        System.out.println("Remove First Regular Dequeue: " + removeFirstDequeue);
        removeFirstDequeue.removeFirst();
        System.out.println("Remove First Dequeue: " + removeFirstDequeue);
    }
    private void removeLastDequeue() {
        Deque<Integer> removeLastDequeue = new ArrayDeque<>();
        removeLastDequeue.add(10);
        removeLastDequeue.add(5);
        removeLastDequeue.add(11);
        removeLastDequeue.add(1);
        System.out.println("Remove Last Regular Dequeue: " + removeLastDequeue);
        removeLastDequeue.removeLast();
        System.out.println("Remove Last Dequeue: " + removeLastDequeue);
    }
    private void removeLastOccuranceDequeue() {
        Deque<Integer> removeLastOccuranceDequeue = new ArrayDeque<>();
        removeLastOccuranceDequeue.add(10);
        removeLastOccuranceDequeue.add(5);
        removeLastOccuranceDequeue.add(11);
        removeLastOccuranceDequeue.add(1);
        System.out.println("Remove Last Occurance Regular Dequeue: " + removeLastOccuranceDequeue);
        removeLastOccuranceDequeue.removeLastOccurrence(5);
        System.out.println("Remove Last Occurance Dequeue: " + removeLastOccuranceDequeue);
    }
    private void sizeDequeue() {
        Deque<Integer> sizeDequeue = new ArrayDeque<>();
        sizeDequeue.add(10);
        sizeDequeue.add(5);
        sizeDequeue.add(11);
        sizeDequeue.add(1);
        System.out.println("Size Dequeue: " + sizeDequeue.size());
    }



    private void dataDequeue() {
        addDequeue();
        addFirstDequeue();
        addLastDequeue();
        containsDequeue();
        descendingIteratorDequeue();
        elementDequeue();
        getFirstDequeue();
        getLastDequeue();
        iteratorDequeue();
        offerDequeue();
        offerFirstDequeue();
        offerLastDequeue();
        peekDequeue();
        peekFirstDequeue();
        peekLastDequeue();
        poolDequeue();
        poolFirstDequeue();
        poolLastDequeue();
        popDequeue();
        pushDequeue();
        removeDequeue();
        removeObjectDequeue();
        removeFirstOccuranceDequeue();
        removeFirstDequeue();
        removeLastDequeue();
        removeLastOccuranceDequeue();
        sizeDequeue();
    }
}
