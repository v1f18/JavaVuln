# JavaVuln

包含了我复现漏洞时使用的环境和具体代码

[nginWebUI](#nginWebUI)

[log4j2](#log4j2)



- <a name="nginWebUI">nginWebUI</a>

  nginxWebUI-3.4.8-runCmd漏洞

- <a name="log4j2">log4j2</a>

  漏洞调用链

  ```java
  lookup:110, JavaLookup
  lookup:223, Interpolator 
  resolveVariable:1116, StrSubstitutor
  substitute:1038, StrSubstitutor
  substitute:912, StrSubstitutor
  replace:467, StrSubstitutor 
  format:132, MessagePatternConverter
  format:38, PatternFormatter 
  toSerializable:345, PatternLayout$PatternSerializer 
  toText:244, PatternLayout 
  encode:229, PatternLayout 
  directEncodeEvent:197, AbstractOutputStreamAppender 
  
  ```





































