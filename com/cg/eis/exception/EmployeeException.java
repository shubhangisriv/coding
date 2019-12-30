package com.cg.eis.exception;

	public class EmployeeException extends Exception{
		 private String str;
		 
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public String toString() {
				if(str==null)
				return "salary should be greater than 1500";
				else return str;
				
			}

			public EmployeeException(String str) {
				super();
				this.str = str;
			}
		public EmployeeException(){}

		}

