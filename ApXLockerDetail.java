
/*------------------------------------------------------------------------------

This source is part of the Flexcube Software System and is
copyrighted by i-flex Solutions Limited.

All rights reserved.  No part of this work may be reproduced,
stored in aretrieval system, adopted or transmitted in any form or
by any means,electronic, mechanical, photographic, graphic,
optic recording or otherwise,translated in any language or
computer language, without the prior written permission of
i-flex Solutions Limited.

i-flex Solutions Limited.
10-11, SDF I, SEEPZ, Andheri (East),
Mumbai - 400 096.
India

Copyright © 2004 i-flex Solutions Limited

Modification History

Date          Version     Author          Description
----------  ----------- --------------- ----------------------------------------
 
------------------------------------------------------------------------------*/
package com.ofss.fc.xface.ext.db.procedure.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Iterator;
import java.sql.ResultSet;
import com.ofss.fc.db.procedure.AbstractProcedure;
import com.ofss.fc.infra.exception.FatalException;
public class ApXLockerDetail  extends AbstractProcedure
{
	
		public static final String PARAM_VAR_PI_BRANCH_CODE = "VarPiBranchCode";
		
	
		public static final String PROC_AP_X_LOCKER_DETAIL = "ApXLockerDetail";
		
	
	/**
	 * Initialize the connection
	 * @param connection
	 */
	public ApXLockerDetail(Connection connection) {
		super(connection);
	}

	/**
	 * Initialize the connection
	 */
	public ApXLockerDetail() throws FatalException{
		super();
	}
    	protected void registerOutParams(String procName) throws SQLException {
    		
    		
    		if (procName.equalsIgnoreCase(PROC_AP_X_LOCKER_DETAIL)) {
	    		
				setOutputParam(1,Types.BIGINT);
		       	setOutputParam(3,Types.VARCHAR);
					
		       	setOutputParam(4,Types.VARCHAR);
					
		       	setOutputParam(5,Types.VARCHAR);
					
		       	setOutputParam(6,Types.VARCHAR);
					
		       	setOutputParam(7,Types.VARCHAR);
					
		       	setOutputParam(8,Types.VARCHAR);
					
		       	setOutputParam(9,Types.VARCHAR);
					
		       	setOutputParam(10,Types.VARCHAR);
					
		       	setOutputParam(11,Types.VARCHAR);
					
		       	setOutputParam(12,Types.VARCHAR);
					
		       	setOutputParam(13,Types.VARCHAR);
					
	       		setOutputParam(14,oracle.jdbc.driver.OracleTypes.CURSOR);
	       		       	
       	}
       	
    	}
    	
	

	private String getStmntForApXLockerDetail() {
		 return "DECLARE\n" +		
		  
		"BEGIN\n" +
		
		   "?:= AP_X_LOCKER_DETAIL(?,?,?,?,?,?,?,?,?,?,?,?,?) ; \n" +
		
		"END;";	
	}
	/**
	 * Execute the procedure and populate the return value object with the Procedure output.
	 */
	public ReturnVOApXLockerDetail 
		execApXLockerDetail(InputVOApXLockerDetail pInputVOApXLockerDetail
		)  throws SQLException {
		String procStmt =  getStmntForApXLockerDetail();
		try {
			
                 
                 debugProcedureStart(PROC_AP_X_LOCKER_DETAIL);
	             prepareCall(procStmt);

			//set the inputs in the statement
			
			setParameter(getParamKey(PROC_AP_X_LOCKER_DETAIL,PARAM_VAR_PI_BRANCH_CODE),pInputVOApXLockerDetail.getVarPiBranchCode(),2);
			debugParameter(PARAM_VAR_PI_BRANCH_CODE, pInputVOApXLockerDetail.getVarPiBranchCode());
	            registerOutParams(PROC_AP_X_LOCKER_DETAIL);
			execute();
			debugProcedureEnd(PROC_AP_X_LOCKER_DETAIL);
			
			return new ReturnVOApXLockerDetail(this);
		} catch(SQLException sqlExcp){
			debugProcedureFailed(PROC_AP_X_LOCKER_DETAIL,sqlExcp);
			throw sqlExcp;
		} finally {
			releaseResources(procStmt);
		}		
	}
	
	
   public class CursorApXLockerDetail_1 {
        	
   }	
        
    private ArrayList cursorApXLockerDetail_1 = new ArrayList();
        
    private void fetchCursorApXLockerDetail_1() throws SQLException {
        ResultSet rst = getCursor(14);
        
        cursorApXLockerDetail_1.clear();
        
        while(rst.next()) {
            CursorApXLockerDetail_1 cursorObj = new CursorApXLockerDetail_1();            
            
             cursorApXLockerDetail_1.add(cursorObj);
        }
        rst.close();
   }
    
	public class InputVOApXLockerDetail {
		public InputVOApXLockerDetail() {
			
				markParamAsNull(getParamKey(PROC_AP_X_LOCKER_DETAIL,PARAM_VAR_PI_BRANCH_CODE));
			
		}
		
		private long varPiBranchCode = 0
		;
		
		public long getVarPiBranchCode() {
			return varPiBranchCode;
		}

		public void setVarPiBranchCode(long aVarPiBranchCode) {
			varPiBranchCode = aVarPiBranchCode;
			
			markParamAsNotNull(getParamKey(PROC_AP_X_LOCKER_DETAIL,PARAM_VAR_PI_BRANCH_CODE));
			
		}

	}
	
	public class ReturnVOApXLockerDetail {
		
		private long 
			returnValue
		;
		
		public long getReturnValue() {
			return returnValue;
		}

		public void setReturnValue(long aReturnValue) {
			returnValue = aReturnValue;
		}
		
		
		private String varPoLocBranchCode
		;
		
		public String getVarPoLocBranchCode() {
			return varPoLocBranchCode;
		}

		public void setVarPoLocBranchCode(String aVarPoLocBranchCode) {
			varPoLocBranchCode = aVarPoLocBranchCode;
		}
		
		private String varPoLocBranchName
		;
		
		public String getVarPoLocBranchName() {
			return varPoLocBranchName;
		}

		public void setVarPoLocBranchName(String aVarPoLocBranchName) {
			varPoLocBranchName = aVarPoLocBranchName;
		}
		
		private String varPoBranchType
		;
		
		public String getVarPoBranchType() {
			return varPoBranchType;
		}

		public void setVarPoBranchType(String aVarPoBranchType) {
			varPoBranchType = aVarPoBranchType;
		}
		
		private String varPoProductCode
		;
		
		public String getVarPoProductCode() {
			return varPoProductCode;
		}

		public void setVarPoProductCode(String aVarPoProductCode) {
			varPoProductCode = aVarPoProductCode;
		}
		
		private String varPoLocType
		;
		
		public String getVarPoLocType() {
			return varPoLocType;
		}

		public void setVarPoLocType(String aVarPoLocType) {
			varPoLocType = aVarPoLocType;
		}
		
		private String varPoUnitNo
		;
		
		public String getVarPoUnitNo() {
			return varPoUnitNo;
		}

		public void setVarPoUnitNo(String aVarPoUnitNo) {
			varPoUnitNo = aVarPoUnitNo;
		}
		
		private String varPoLocNo
		;
		
		public String getVarPoLocNo() {
			return varPoLocNo;
		}

		public void setVarPoLocNo(String aVarPoLocNo) {
			varPoLocNo = aVarPoLocNo;
		}
		
		private String varPoLocSeries
		;
		
		public String getVarPoLocSeries() {
			return varPoLocSeries;
		}

		public void setVarPoLocSeries(String aVarPoLocSeries) {
			varPoLocSeries = aVarPoLocSeries;
		}
		
		private String varPoLocDimension
		;
		
		public String getVarPoLocDimension() {
			return varPoLocDimension;
		}

		public void setVarPoLocDimension(String aVarPoLocDimension) {
			varPoLocDimension = aVarPoLocDimension;
		}
		
		private String varPoLocRent
		;
		
		public String getVarPoLocRent() {
			return varPoLocRent;
		}

		public void setVarPoLocRent(String aVarPoLocRent) {
			varPoLocRent = aVarPoLocRent;
		}
		
		private String varPoLocStatus
		;
		
		public String getVarPoLocStatus() {
			return varPoLocStatus;
		}

		public void setVarPoLocStatus(String aVarPoLocStatus) {
			varPoLocStatus = aVarPoLocStatus;
		}
		
	       public CursorApXLockerDetail_1[] getCursor1() {
	           CursorApXLockerDetail_1[] cursor = new CursorApXLockerDetail_1[cursorApXLockerDetail_1.size()];
	           Iterator it = cursorApXLockerDetail_1.iterator();
	           int i=0;
	           while (it.hasNext()) {
	               cursor[i++] = (CursorApXLockerDetail_1)it.next();
	           }
	           return cursor;
	       }		
		ReturnVOApXLockerDetail
		(ApXLockerDetail proc) throws SQLException {
			setReturnValue(proc.getLong(1));
				
			setVarPoLocBranchCode(proc.getString(3));
			
			setVarPoLocBranchName(proc.getString(4));
			
			setVarPoBranchType(proc.getString(5));
			
			setVarPoProductCode(proc.getString(6));
			
			setVarPoLocType(proc.getString(7));
			
			setVarPoUnitNo(proc.getString(8));
			
			setVarPoLocNo(proc.getString(9));
			
			setVarPoLocSeries(proc.getString(10));
			
			setVarPoLocDimension(proc.getString(11));
			
			setVarPoLocRent(proc.getString(12));
			
			setVarPoLocStatus(proc.getString(13));
			
			proc.fetchCursorApXLockerDetail_1();			
		}		
	}
	
}
