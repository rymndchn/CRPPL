import numpy as np
import matplotlib.pyplot as plt
import shutil
import pandas as pd

source = r'CRPPL/CSV Files/source/1000 - Emp Leaves2.csv'
target = r'CRPPL/CSV Files/target/emps.csv'
shutil.copyfile(source,target)
emp = pd.read_csv('CRPPL/CSV Files/target/emps.csv')

# i am checking line
#entering assignment
<<<<<<< HEAD

#exiting assignment
# i am checking line
if ( all = 'True' ) :
	emp["emp_count"] = "null"
	emp.to_csv('CRPPL/CSV Files/target/emp.csv', index=False)
# i am checking line
else:
	emp.loc[emp.emp_count==None,"emp_count"]='1'
	emp.to_csv('CRPPL/CSV Files/target/emp.csv', index=False)
# i am checking line
#entering assignment
	tmp_result = emp[["Company_Name","emp_count"]]
	grouped = tmp_result.groupby(["Company_Name"])
	tmp_result = grouped.agg({"emp_count":"sum"})
	print(tmp_result)
	leaveCtr=grouped.agg({"emp_count":"sum"})
# i am checking line

#exiting assignment
# i am checking line
	emp["emp_count"] = "null"
	emp.to_csv('CRPPL/CSV Files/target/emp.csv', index=False)
# i am checking line
	emp.loc[emp.emp_count==None,"emp_count"]='1'
	emp.to_csv('CRPPL/CSV Files/target/emp.csv', index=False)
# i am checking line
#entering assignment
	tmp_result = emp[emp["Leave"]!=0]
	grouped = tmp_result.groupby(["Company_Name"])
	tmp_result = grouped.agg({"emp_count":"sum"})
	print(tmp_result)
	leaveCtr=grouped.agg({"emp_count":"sum"})
# i am checking line

#exiting assignment
# i am checking line

#end if
# i am checking line
#inside grouping isFalse
#insissdfdfdsFalse
print(leaveCtr.plot.bar())
plt.xlabel('Company_Name')
plt.ylabel('sum')
plt.savefig('Report/bar.pdf',bbox_inches='tight')
=======
tmp_result = sales[["TotalProfit"]]
grouped = sales
tmp_result = grouped.agg({"TotalProfit":"mean"})
print(tmp_result)
sales_mean=grouped.agg({"TotalProfit":"mean"})
sales_mean = sales_mean.tolist()[0]
# i am checking line

#exiting assignment
# i am checking line
#entering assignment
data_count = 100
#exiting assignment
>>>>>>> 5441f51307d29afb68940649a57e9481f9ce895c
# i am checking line
