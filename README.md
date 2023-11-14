# vulnerable_setResult
一个利用setResult的漏洞案例
# 文件说明
- setResult    受害apk
- attackintent 攻击apk

# 漏洞描述
- 受害应用使用startActivityForResult和setResult进行activity之间的交互
- 其中activityB接收了activityA传来的请求，并返回了一个含有敏感信息的intent给activityA
- ActivityB可导出，导致攻击者可以通过startActivityForResult获取activityB中的敏感信息，同时可以维持受害apk的权限进行私有目录读写等操作

# 实际场景
- 身份校验场景，对应A-->B，在B中进行身份信息比对，身份信息可窃取
  
