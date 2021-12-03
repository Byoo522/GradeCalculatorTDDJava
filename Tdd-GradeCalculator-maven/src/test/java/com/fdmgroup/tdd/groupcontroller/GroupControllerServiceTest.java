package com.fdmgroup.tdd.groupcontroller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

public class GroupControllerServiceTest {
	@Test
	public void test_TraineesReturnedFromDatabaseReader() {
		DatabaseReader dbRead = Mockito.mock(DatabaseReader.class);
		GroupController groupCtrl = new GroupController(dbRead);
		groupCtrl.getAllTrainees();
		verify(dbRead, times(1)).readGroup();
	}
}
