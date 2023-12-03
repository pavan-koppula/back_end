package com.pavan.methodsimpl;

import com.pavan.methods.SudentAddressMethods;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

public class StdAddressImpl implements SudentAddressMethods {

	@Override
	public void CreatStdAddressRecord() {
		// TODO Auto-generated method stub
		System.out.println("Record Created");
	}

	@Override
	public void ReadStdAddressRecord(String res) {
		// TODO Auto-generated method stub
		System.out.println(res);
	}

	@Override
	public void UpdateStdAddressRecord() {
		// TODO Auto-generated method stub
		System.out.println("Record Updated");
	}

	@Override
	public void DeleteStdAddressRecord() {
		// TODO Auto-generated method stub
		System.out.println("Record Deleted");
	}

	@Override
	public void FailedMethod() {
		// TODO Auto-generated method stub
		System.out.println("Execution Failed");
	}

}
