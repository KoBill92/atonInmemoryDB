# Inmemory Data base 
----------------
In memory simple DB In the process of implementing the data validation service, it became necessary to organize an in memory cache with the ability to quickly search    through different fields.
The data structure is represented by the following set of fields:
```
{
  "account": "234678", //long
  "name": "Ivanov Ivan Ivanovich", //string
  "value": "2035.34" //double
}
```
> **Note:** The number of entries is not predetermined and can change dynamically.

**QUESTION:**
* 1. provide the ability to add new records;
* 2. provide the ability to delete records that are no longer needed;
* 3. provide the ability to change the record;
* 4. get the full record set for any of the fields with the same algorithmic complexity (no slower than log(n));
* 5. choose the most economical way to store data in memory.

### Important: It is necessary to justify the choice of data structures and algorithms in relation to the requirements. Restriction: Use one of the following languages for implementation: Java, C#, C++, Python
