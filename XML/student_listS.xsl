<?xml version="1.0"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="student">
  <table align="center" border="0" cellspacing="5" cellpadding="2">
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
    <xsl:apply-templates select="checkboxes"/>
  </table>
</xsl:template>

<xsl:template match="checkboxes">
  <xsl:for-each select="category">
    <tr>
      <th align="right" valign="top"><xsl:value-of select="@name"/></th>
      <td>
        <xsl:for-each select="item">
          <xsl:value-of select="text"/><br/>
        </xsl:for-each>
      </td>
    </tr>
  </xsl:for-each>
</xsl:template>

<xsl:template match="interests">
  <xsl:for-each select="interest">
    <xsl:value-of select="name"/> (<xsl:value-of select="@checks"/> of <xsl:value-of select="@max2"/>)<br/>
  </xsl:for-each>
</xsl:template>

</xsl:stylesheet>

