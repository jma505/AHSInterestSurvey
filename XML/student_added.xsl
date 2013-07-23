<?xml version="1.0"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="student">
  <table align="center" border="0" cellspacing="1" cellpadding="3">
    <tr>
      <th align="right">Student:</th>
      <td align="left">
         <xsl:value-of select="firstname"/><xsl:text> </xsl:text>
         <xsl:value-of select="lastname"/></td>
    </tr>
    <tr>
      <th align="right">Teacher:</th>
      <td align="left">
         <xsl:value-of select="teacher/lastname"/> (Grade <xsl:value-of select="teacher/grade"/>)</td>
    </tr>
    <tr>
      <th align="right" valign="top">Interests:</th>
      <td align="left">
        <xsl:apply-templates select="interests"/>
      </td>
    </tr>
  </table>
</xsl:template>

<xsl:template match="interests">
  <xsl:for-each select="interest">
    <xsl:value-of select="name"/> (score = <xsl:value-of select="@count"/>)<br/>
  </xsl:for-each>
</xsl:template>

</xsl:stylesheet>

