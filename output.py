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

#exiting assignment
# i am checking line
emp["emp_count"] = "null"
emp.to_csv('CRPPL/CSV Files/target/emp.csv', index=False)
# i am checking line
emp.loc[emp.emp_count=='null',"emp_count"]=1
emp.to_csv('CRPPL/CSV Files/target/emp.csv', index=False)
# i am checking line
if ( all == True ) :
#entering assignment
	tmp_result = emp[["Company_Name","emp_count"]]
	grouped = tmp_result.groupby(["Company_Name"])
	tmp_result = grouped.agg({"emp_count":"sum"})
	print(tmp_result)
	leaveCtr=grouped.agg({"emp_count":"sum"})
# i am checking line
else:

#exiting assignment
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
# i am checking line
