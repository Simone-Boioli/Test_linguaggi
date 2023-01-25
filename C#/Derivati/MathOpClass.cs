using System;

namespace Application
{
	
	
	public class MathOpClass
	{
		public delegate void OpDelegate(double primo ,double secondo);
		
		private double val1;
		private double val2;
		public OpDelegate Op;
		//costruttore

		public MathOpClass(double v1, double v2){
				this.val1 = v1;
				this.val2 = v2;
		}
		/*
		public void Multiply (double a, double b){ 
			Console.WriteLine(a * b);
		}
		*/
		public void Add(double v1, double v2){
			Console.WriteLine(val1 + val2);
		}	
		/*
		public void Sub(double a, double b){
			Console.WriteLine(a - b);
		}
		*/
		
		public void CallOp(){
				
		}
		
		public static void Main(){
			MathOpClass classe = new MathOpClass(3,2);
			classe.Op += new MathOpClass.OpDelegate(classe.Add);
			
		}
	}
}

