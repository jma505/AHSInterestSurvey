<?xml version="1.0"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="student">
  <xsl:value-of select="firstname"/><xsl:text> </xsl:text>
  <xsl:value-of select="lastname"/><xsl:text> (</xsl:text>
  <xsl:value-of select="teacher/lastname"/> - Grade <xsl:value-of select="teacher/grade"/>)
</xsl:template>

</xsl:stylesheet>

