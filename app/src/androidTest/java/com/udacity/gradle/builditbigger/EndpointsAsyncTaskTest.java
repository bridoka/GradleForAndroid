package com.udacity.gradle.builditbigger;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;
import androidx.lifecycle.Observer;

import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class EndpointsAsyncTaskTest {
    @Rule
    public InstantTaskExecutorRule instantTaskExecutorRule = new InstantTaskExecutorRule();

    @Test
    public void testVerifyEchoResponse() {
        com.udacity.gradle.paid.EndpointsAsyncTask endpointsAsyncTask = new com.udacity.gradle.paid.EndpointsAsyncTask();
        endpointsAsyncTask.execute();
        endpointsAsyncTask.joke.observeForever(new Observer<String>() {
            @Override
            public void onChanged(String s) {
                assertFalse(s.isEmpty());
            }
        });
    }
}
