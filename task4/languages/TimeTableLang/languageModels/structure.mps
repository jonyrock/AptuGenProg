<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:75af391f-7dcc-4116-bdfd-e4715b91349b(TimeTableLang.structure)" version="3">
  <persistence version="8" />
  <language namespace="c72da2b9-7cce-4447-8389-f407dc1158b7(jetbrains.mps.lang.structure)" />
  <devkit namespace="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  <import index="tpce" modelUID="r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)" version="0" implicit="yes" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="tazn" modelUID="r:75af391f-7dcc-4116-bdfd-e4715b91349b(TimeTableLang.structure)" version="3" implicit="yes" />
  <root type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="8117425987503668721" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="Timetable" />
    <property name="conceptShortDescription" nameId="tpce.4628067390765907488" value="Timetable root node" />
    <property name="rootable" nameId="tpce.1096454100552" value="true" />
    <property name="conceptAlias" nameId="tpce.5092175715804935370" value="Timetable" />
    <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="8117425987504119575" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="name" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="8117425987504119577" resolveInfo="DayName" />
    </node>
    <node role="linkDeclaration" roleId="tpce.1071489727083" type="tpce.LinkDeclaration" typeId="tpce.1071489288298" id="8117425987503702173" nodeInfo="ig">
      <property name="metaClass" nameId="tpce.1071599937831" value="aggregation" />
      <property name="role" nameId="tpce.1071599776563" value="lectures" />
      <property name="sourceCardinality" nameId="tpce.1071599893252" value="0..n" />
      <link role="target" roleId="tpce.1071599976176" targetNodeId="8117425987503702178" resolveInfo="Lecture" />
    </node>
  </root>
  <root type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="8117425987503702178" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="Lecture" />
    <property name="conceptAlias" nameId="tpce.5092175715804935370" value="lecture" />
    <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="8117425987503708298" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="inRoom" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983657062" resolveInfo="integer" />
    </node>
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="8117425987503708329" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="presenter" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983041843" resolveInfo="string" />
    </node>
    <node role="implements" roleId="tpce.1169129564478" type="tpce.InterfaceConceptReference" typeId="tpce.1169127622168" id="8117425987503702291" nodeInfo="ig">
      <link role="intfc" roleId="tpce.1169127628841" targetNodeId="tpck.1169194658468" resolveInfo="INamedConcept" />
    </node>
    <node role="linkDeclaration" roleId="tpce.1071489727083" type="tpce.LinkDeclaration" typeId="tpce.1071489288298" id="8117425987503708283" nodeInfo="ig">
      <property name="metaClass" nameId="tpce.1071599937831" value="aggregation" />
      <property name="role" nameId="tpce.1071599776563" value="at" />
      <property name="sourceCardinality" nameId="tpce.1071599893252" value="1" />
      <link role="target" roleId="tpce.1071599976176" targetNodeId="8117425987503708235" resolveInfo="TimeSpanLiteral" />
    </node>
  </root>
  <root type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="8117425987503708235" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="TimeSpanLiteral" />
    <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="8117425987503708236" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="fromHours" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983657062" resolveInfo="integer" />
    </node>
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="8117425987503708238" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="fromMinutes" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983657062" resolveInfo="integer" />
    </node>
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="8117425987503708241" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="toHours" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983657062" resolveInfo="integer" />
    </node>
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="8117425987503708245" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="toMinutes" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983657062" resolveInfo="integer" />
    </node>
  </root>
  <root type="tpce.EnumerationDataTypeDeclaration" typeId="tpce.1082978164219" id="8117425987504119577" nodeInfo="ng">
    <property name="name" nameId="tpck.1169194664001" value="DayName" />
    <link role="memberDataType" roleId="tpce.1083171729157" targetNodeId="tpck.1082983041843" resolveInfo="string" />
    <node role="member" roleId="tpce.1083172003582" type="tpce.EnumerationMemberDeclaration" typeId="tpce.1083171877298" id="8117425987504119578" nodeInfo="ig">
      <property name="internalValue" nameId="tpce.1083923523171" value="Sunday" />
      <property name="externalValue" nameId="tpce.1083923523172" value="Sunday" />
    </node>
    <node role="member" roleId="tpce.1083172003582" type="tpce.EnumerationMemberDeclaration" typeId="tpce.1083171877298" id="8117425987504119594" nodeInfo="ig">
      <property name="internalValue" nameId="tpce.1083923523171" value="Monday" />
      <property name="externalValue" nameId="tpce.1083923523172" value="Monday" />
    </node>
    <node role="member" roleId="tpce.1083172003582" type="tpce.EnumerationMemberDeclaration" typeId="tpce.1083171877298" id="8117425987504119677" nodeInfo="ig">
      <property name="internalValue" nameId="tpce.1083923523171" value="Tuesday" />
      <property name="externalValue" nameId="tpce.1083923523172" value="Tuesday" />
    </node>
    <node role="member" roleId="tpce.1083172003582" type="tpce.EnumerationMemberDeclaration" typeId="tpce.1083171877298" id="8117425987504119732" nodeInfo="ig">
      <property name="internalValue" nameId="tpce.1083923523171" value="Wednesday" />
      <property name="externalValue" nameId="tpce.1083923523172" value="Wednesday" />
    </node>
    <node role="member" roleId="tpce.1083172003582" type="tpce.EnumerationMemberDeclaration" typeId="tpce.1083171877298" id="8117425987504119791" nodeInfo="ig">
      <property name="internalValue" nameId="tpce.1083923523171" value="Thursday" />
      <property name="externalValue" nameId="tpce.1083923523172" value="Thursday" />
    </node>
    <node role="member" roleId="tpce.1083172003582" type="tpce.EnumerationMemberDeclaration" typeId="tpce.1083171877298" id="8117425987504119816" nodeInfo="ig">
      <property name="externalValue" nameId="tpce.1083923523172" value="Friday" />
      <property name="internalValue" nameId="tpce.1083923523171" value="Friday" />
    </node>
    <node role="member" roleId="tpce.1083172003582" type="tpce.EnumerationMemberDeclaration" typeId="tpce.1083171877298" id="8117425987504119843" nodeInfo="ig">
      <property name="externalValue" nameId="tpce.1083923523172" value="Saturday" />
      <property name="internalValue" nameId="tpce.1083923523171" value="Saturday" />
    </node>
  </root>
</model>

