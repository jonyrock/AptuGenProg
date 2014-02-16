<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:51cf1aee-927a-486d-94d1-8ec5c6fe849d(TimeTableLang.generator.template.main@generator)">
  <persistence version="8" />
  <language namespace="f28ef78b-dc98-4502-9ce2-abebd24f76f6(TimeTableLang)" />
  <language namespace="ceab5195-25ea-4f22-9b92-103b95ca8c0c(jetbrains.mps.lang.core)" />
  <language namespace="b401a680-8325-4110-8fd3-84331ff25bef(jetbrains.mps.lang.generator)" />
  <language namespace="d7706f63-9be2-479c-a3da-ae92af1e64d5(jetbrains.mps.lang.generator.generationContext)" />
  <language namespace="479c7a8c-02f9-43b5-9139-d910cb22f298(jetbrains.mps.core.xml)" />
  <language namespace="b83431fe-5c8f-40bc-8a36-65e25f4dd253(jetbrains.mps.lang.textGen)" />
  <devkit namespace="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="tpf8" modelUID="r:00000000-0000-4000-0000-011c895902e8(jetbrains.mps.lang.generator.structure)" version="2" implicit="yes" />
  <import index="tazn" modelUID="r:75af391f-7dcc-4116-bdfd-e4715b91349b(TimeTableLang.structure)" version="3" implicit="yes" />
  <import index="iuxj" modelUID="r:64db3a92-5968-4a73-b456-34504a2d97a6(jetbrains.mps.core.xml.structure)" version="2" implicit="yes" />
  <import index="tpee" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="4" implicit="yes" />
  <import index="tp25" modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" implicit="yes" />
  <import index="tp2c" modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="3" implicit="yes" />
  <import index="tp2q" modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="7" implicit="yes" />
  <root type="tpf8.MappingConfiguration" typeId="tpf8.1095416546421" id="8117425987503387250" nodeInfo="ng">
    <property name="name" nameId="tpck.1169194664001" value="main" />
    <node role="rootMappingRule" roleId="tpf8.1167514678247" type="tpf8.Root_MappingRule" typeId="tpf8.1167514355419" id="8117425987505105269" nodeInfo="ng">
      <link role="applicableConcept" roleId="tpf8.1167169349424" targetNodeId="tazn.8117425987503668721" resolveInfo="Timetable" />
      <link role="template" roleId="tpf8.1167514355421" targetNodeId="8117425987505878501" resolveInfo="TimetableXmlImp" />
    </node>
  </root>
  <root type="iuxj.XmlFile" typeId="iuxj.6666499814681515200" id="8117425987505878501" nodeInfo="ng">
    <property name="name" nameId="tpck.1169194664001" value="TimetableXmlImp" />
    <node role="document" roleId="iuxj.6666499814681515201" type="iuxj.XmlDocument" typeId="iuxj.6786756355279841993" id="8117425987505878502" nodeInfo="ng">
      <node role="prolog" roleId="iuxj.6666499814681299060" type="iuxj.XmlProlog" typeId="iuxj.6666499814681299057" id="8117425987505878506" nodeInfo="ng">
        <node role="elements" roleId="iuxj.7604553062773674214" type="iuxj.XmlDoctypeDeclaration" typeId="iuxj.2133624044437898907" id="8117425987505878508" nodeInfo="ng">
          <property name="doctypeName" nameId="iuxj.2133624044437898910" value="html" />
        </node>
      </node>
      <node role="rootElement" roleId="iuxj.6666499814681299055" type="iuxj.XmlElement" typeId="iuxj.6666499814681415858" id="8117425987505878541" nodeInfo="ng">
        <property name="tagName" nameId="iuxj.6666499814681415862" value="html" />
        <node role="content" roleId="iuxj.1622293396948928802" type="iuxj.XmlElement" typeId="iuxj.6666499814681415858" id="8117425987505878543" nodeInfo="ng">
          <property name="tagName" nameId="iuxj.6666499814681415862" value="title" />
          <node role="content" roleId="iuxj.1622293396948928802" type="iuxj.XmlText" typeId="iuxj.1622293396948952339" id="8117425987505878563" nodeInfo="nn">
            <property name="value" nameId="iuxj.1622293396948953704" value="name" />
            <node role="smodelAttribute" roleId="tpck.5169995583184591170" type="tpf8.PropertyMacro" typeId="tpf8.1087833241328" id="8117425987505878605" nodeInfo="nn">
              <property name="propertyName" nameId="tpck.1757699476691236117" value="value" />
              <node role="propertyValueFunction" roleId="tpf8.1167756362303" type="tpf8.PropertyMacro_GetPropertyValue" typeId="tpf8.1167756080639" id="8117425987505878606" nodeInfo="nn">
                <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="8117425987505878607" nodeInfo="sn">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="8117425987505879993" nodeInfo="nn">
                    <node role="expression" roleId="tpee.1068580123156" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="8117425987505885805" nodeInfo="nn">
                      <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8117425987505887014" nodeInfo="nn">
                        <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="8117425987505886518" nodeInfo="nn" />
                        <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="8117425987505890446" nodeInfo="nn">
                          <link role="property" roleId="tp25.1138056395725" targetNodeId="tazn.8117425987504119575" resolveInfo="name" />
                        </node>
                      </node>
                      <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="8117425987505879992" nodeInfo="nn">
                        <property name="value" nameId="tpee.1070475926801" value="Timetable" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="content" roleId="iuxj.1622293396948928802" type="iuxj.XmlElement" typeId="iuxj.6666499814681415858" id="8117425987505900807" nodeInfo="ng">
          <property name="tagName" nameId="iuxj.6666499814681415862" value="head" />
          <node role="content" roleId="iuxj.1622293396948928802" type="iuxj.XmlElement" typeId="iuxj.6666499814681415858" id="8117425987505892763" nodeInfo="ng">
            <property name="tagName" nameId="iuxj.6666499814681415862" value="style" />
            <node role="content" roleId="iuxj.1622293396948928802" type="iuxj.XmlText" typeId="iuxj.1622293396948952339" id="8117425987505897923" nodeInfo="nn">
              <property name="value" nameId="iuxj.1622293396948953704" value="html{ font-family: Arial, sans-serif }\n        table { border-spacing: 0; border-collapse: separate; width: 400px; margin:auto; border: 2px solid #ccc }\n        table td{ padding: 5px; text-align: center }\n        table thead td{ font-weight: bold; padding: 10px; text-align: center; font-size: larger }\n        table thead.head2 td{ border-top: 1px solid #ccc; border-bottom: 1px solid #ccc; font-size: medium }" />
            </node>
          </node>
        </node>
        <node role="content" roleId="iuxj.1622293396948928802" type="iuxj.XmlElement" typeId="iuxj.6666499814681415858" id="8117425987505911869" nodeInfo="ng">
          <property name="tagName" nameId="iuxj.6666499814681415862" value="body" />
          <node role="content" roleId="iuxj.1622293396948928802" type="iuxj.XmlElement" typeId="iuxj.6666499814681415858" id="8117425987505913059" nodeInfo="ng">
            <property name="tagName" nameId="iuxj.6666499814681415862" value="table" />
            <node role="content" roleId="iuxj.1622293396948928802" type="iuxj.XmlElement" typeId="iuxj.6666499814681415858" id="8117425987505921229" nodeInfo="ng">
              <property name="tagName" nameId="iuxj.6666499814681415862" value="thead" />
              <node role="content" roleId="iuxj.1622293396948928802" type="iuxj.XmlElement" typeId="iuxj.6666499814681415858" id="8117425987505923180" nodeInfo="ng">
                <property name="tagName" nameId="iuxj.6666499814681415862" value="td" />
                <node role="attributes" roleId="iuxj.6666499814681415861" type="iuxj.XmlAttribute" typeId="iuxj.6666499814681447923" id="8117425987505923772" nodeInfo="ng">
                  <property name="attrName" nameId="iuxj.6666499814681447926" value="colspan" />
                  <node role="value" roleId="iuxj.6666499814681541918" type="iuxj.XmlTextValue" typeId="iuxj.6666499814681541919" id="8117425987505923828" nodeInfo="ng">
                    <property name="text" nameId="iuxj.6666499814681541920" value="4" />
                  </node>
                </node>
                <node role="content" roleId="iuxj.1622293396948928802" type="iuxj.XmlText" typeId="iuxj.1622293396948952339" id="8117425987505923858" nodeInfo="nn">
                  <property name="value" nameId="iuxj.1622293396948953704" value="name" />
                  <node role="smodelAttribute" roleId="tpck.5169995583184591170" type="tpf8.PropertyMacro" typeId="tpf8.1087833241328" id="8117425987505923860" nodeInfo="nn">
                    <property name="propertyName" nameId="tpck.1757699476691236117" value="value" />
                    <node role="propertyValueFunction" roleId="tpf8.1167756362303" type="tpf8.PropertyMacro_GetPropertyValue" typeId="tpf8.1167756080639" id="8117425987505923861" nodeInfo="nn">
                      <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="8117425987505923862" nodeInfo="sn">
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="8117425987505924555" nodeInfo="nn">
                          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8117425987505924913" nodeInfo="nn">
                            <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="8117425987505924554" nodeInfo="nn" />
                            <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="8117425987505926985" nodeInfo="nn">
                              <link role="property" roleId="tp25.1138056395725" targetNodeId="tazn.8117425987504119575" resolveInfo="name" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="content" roleId="iuxj.1622293396948928802" type="iuxj.XmlElement" typeId="iuxj.6666499814681415858" id="8117425987505931502" nodeInfo="ng">
              <property name="tagName" nameId="iuxj.6666499814681415862" value="thead" />
              <node role="content" roleId="iuxj.1622293396948928802" type="iuxj.XmlElement" typeId="iuxj.6666499814681415858" id="8117425987505932936" nodeInfo="ng">
                <property name="tagName" nameId="iuxj.6666499814681415862" value="td" />
                <node role="content" roleId="iuxj.1622293396948928802" type="iuxj.XmlText" typeId="iuxj.1622293396948952339" id="8117425987505933973" nodeInfo="nn">
                  <property name="value" nameId="iuxj.1622293396948953704" value=" name " />
                </node>
              </node>
              <node role="content" roleId="iuxj.1622293396948928802" type="iuxj.XmlElement" typeId="iuxj.6666499814681415858" id="8117425987505934930" nodeInfo="ng">
                <property name="tagName" nameId="iuxj.6666499814681415862" value="td" />
                <node role="content" roleId="iuxj.1622293396948928802" type="iuxj.XmlText" typeId="iuxj.1622293396948952339" id="8117425987505935928" nodeInfo="nn">
                  <property name="value" nameId="iuxj.1622293396948953704" value=" at " />
                </node>
              </node>
              <node role="content" roleId="iuxj.1622293396948928802" type="iuxj.XmlElement" typeId="iuxj.6666499814681415858" id="8117425987505936024" nodeInfo="ng">
                <property name="tagName" nameId="iuxj.6666499814681415862" value="td" />
                <node role="content" roleId="iuxj.1622293396948928802" type="iuxj.XmlText" typeId="iuxj.1622293396948952339" id="8117425987505936981" nodeInfo="nn">
                  <property name="value" nameId="iuxj.1622293396948953704" value=" room " />
                </node>
              </node>
              <node role="content" roleId="iuxj.1622293396948928802" type="iuxj.XmlElement" typeId="iuxj.6666499814681415858" id="8117425987505937083" nodeInfo="ng">
                <property name="tagName" nameId="iuxj.6666499814681415862" value="td" />
                <node role="content" roleId="iuxj.1622293396948928802" type="iuxj.XmlText" typeId="iuxj.1622293396948952339" id="8117425987505938042" nodeInfo="nn">
                  <property name="value" nameId="iuxj.1622293396948953704" value=" presenter " />
                </node>
              </node>
              <node role="attributes" roleId="iuxj.6666499814681415861" type="iuxj.XmlAttribute" typeId="iuxj.6666499814681447923" id="8117425987505932851" nodeInfo="ng">
                <property name="attrName" nameId="iuxj.6666499814681447926" value="class" />
                <node role="value" roleId="iuxj.6666499814681541918" type="iuxj.XmlTextValue" typeId="iuxj.6666499814681541919" id="8117425987505932892" nodeInfo="ng">
                  <property name="text" nameId="iuxj.6666499814681541920" value="head2" />
                </node>
              </node>
            </node>
            <node role="content" roleId="iuxj.1622293396948928802" type="iuxj.XmlElement" typeId="iuxj.6666499814681415858" id="8117425987505939999" nodeInfo="ng">
              <property name="tagName" nameId="iuxj.6666499814681415862" value="tr" />
              <node role="content" roleId="iuxj.1622293396948928802" type="iuxj.XmlElement" typeId="iuxj.6666499814681415858" id="8117425987505941460" nodeInfo="ng">
                <property name="tagName" nameId="iuxj.6666499814681415862" value="td" />
                <node role="content" roleId="iuxj.1622293396948928802" type="iuxj.XmlText" typeId="iuxj.1622293396948952339" id="8117425987506062659" nodeInfo="nn">
                  <property name="value" nameId="iuxj.1622293396948953704" value="name" />
                  <node role="smodelAttribute" roleId="tpck.5169995583184591170" type="tpf8.PropertyMacro" typeId="tpf8.1087833241328" id="8117425987506062661" nodeInfo="nn">
                    <property name="propertyName" nameId="tpck.1757699476691236117" value="value" />
                    <node role="propertyValueFunction" roleId="tpf8.1167756362303" type="tpf8.PropertyMacro_GetPropertyValue" typeId="tpf8.1167756080639" id="8117425987506062662" nodeInfo="nn">
                      <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="8117425987506062663" nodeInfo="sn">
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="8117425987506063356" nodeInfo="nn">
                          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8117425987506063799" nodeInfo="nn">
                            <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="8117425987506063355" nodeInfo="nn" />
                            <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="8117425987506074691" nodeInfo="nn">
                              <link role="property" roleId="tp25.1138056395725" targetNodeId="tpck.1169194664001" resolveInfo="name" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="content" roleId="iuxj.1622293396948928802" type="iuxj.XmlElement" typeId="iuxj.6666499814681415858" id="8117425987506081029" nodeInfo="ng">
                <property name="tagName" nameId="iuxj.6666499814681415862" value="td" />
                <node role="content" roleId="iuxj.1622293396948928802" type="iuxj.XmlText" typeId="iuxj.1622293396948952339" id="8117425987506087153" nodeInfo="nn">
                  <property name="value" nameId="iuxj.1622293396948953704" value="10:00 - 11:00" />
                  <node role="smodelAttribute" roleId="tpck.5169995583184591170" type="tpf8.PropertyMacro" typeId="tpf8.1087833241328" id="8117425987506087339" nodeInfo="nn">
                    <property name="propertyName" nameId="tpck.1757699476691236117" value="value" />
                    <node role="propertyValueFunction" roleId="tpf8.1167756362303" type="tpf8.PropertyMacro_GetPropertyValue" typeId="tpf8.1167756080639" id="8117425987506087340" nodeInfo="nn">
                      <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="8117425987506087341" nodeInfo="sn">
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="8117425987506087694" nodeInfo="nn">
                          <node role="expression" roleId="tpee.1068580123156" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="8117425987506254427" nodeInfo="nn">
                            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8117425987506293837" nodeInfo="nn">
                              <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8117425987506281431" nodeInfo="nn">
                                <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8117425987506261719" nodeInfo="nn">
                                  <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="8117425987506259395" nodeInfo="nn" />
                                  <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="8117425987506271610" nodeInfo="nn">
                                    <link role="link" roleId="tp25.1138056516764" targetNodeId="tazn.8117425987503708283" />
                                  </node>
                                </node>
                                <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="8117425987506288044" nodeInfo="nn">
                                  <link role="link" roleId="tp25.1138056516764" targetNodeId="tazn.8117425987504225525" />
                                </node>
                              </node>
                              <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="8117425987506300524" nodeInfo="nn">
                                <link role="property" roleId="tp25.1138056395725" targetNodeId="tazn.8117425987504225433" resolveInfo="minutes" />
                              </node>
                            </node>
                            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="8117425987506243005" nodeInfo="nn">
                              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="8117425987506182530" nodeInfo="nn">
                                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="8117425987506164478" nodeInfo="nn">
                                  <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="8117425987506125251" nodeInfo="nn">
                                    <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="8117425987506117962" nodeInfo="nn">
                                      <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8117425987506111839" nodeInfo="nn">
                                        <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8117425987506105236" nodeInfo="nn">
                                          <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8117425987506088137" nodeInfo="nn">
                                            <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="8117425987506087693" nodeInfo="nn" />
                                            <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="8117425987506098685" nodeInfo="nn">
                                              <link role="link" roleId="tp25.1138056516764" targetNodeId="tazn.8117425987503708283" />
                                            </node>
                                          </node>
                                          <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="8117425987506109354" nodeInfo="nn">
                                            <link role="link" roleId="tp25.1138056516764" targetNodeId="tazn.8117425987504225478" />
                                          </node>
                                        </node>
                                        <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="8117425987506114468" nodeInfo="nn">
                                          <link role="property" roleId="tp25.1138056395725" targetNodeId="tazn.8117425987504225408" resolveInfo="hours" />
                                        </node>
                                      </node>
                                      <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="8117425987506118767" nodeInfo="nn">
                                        <property name="value" nameId="tpee.1070475926801" value=":" />
                                      </node>
                                    </node>
                                    <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8117425987506155165" nodeInfo="nn">
                                      <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8117425987506146231" nodeInfo="nn">
                                        <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8117425987506129991" nodeInfo="nn">
                                          <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="8117425987506128445" nodeInfo="nn" />
                                          <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="8117425987506137966" nodeInfo="nn">
                                            <link role="link" roleId="tp25.1138056516764" targetNodeId="tazn.8117425987503708283" />
                                          </node>
                                        </node>
                                        <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="8117425987506150928" nodeInfo="nn">
                                          <link role="link" roleId="tp25.1138056516764" targetNodeId="tazn.8117425987504225478" />
                                        </node>
                                      </node>
                                      <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="8117425987506159936" nodeInfo="nn">
                                        <link role="property" roleId="tp25.1138056395725" targetNodeId="tazn.8117425987504225433" resolveInfo="minutes" />
                                      </node>
                                    </node>
                                  </node>
                                  <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="8117425987506167946" nodeInfo="nn">
                                    <property name="value" nameId="tpee.1070475926801" value=" - " />
                                  </node>
                                </node>
                                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8117425987506227535" nodeInfo="nn">
                                  <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8117425987506212794" nodeInfo="nn">
                                    <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8117425987506188989" nodeInfo="nn">
                                      <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="8117425987506187054" nodeInfo="nn" />
                                      <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="8117425987506202977" nodeInfo="nn">
                                        <link role="link" roleId="tp25.1138056516764" targetNodeId="tazn.8117425987503708283" />
                                      </node>
                                    </node>
                                    <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="8117425987506222520" nodeInfo="nn">
                                      <link role="link" roleId="tp25.1138056516764" targetNodeId="tazn.8117425987504225525" />
                                    </node>
                                  </node>
                                  <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="8117425987506234621" nodeInfo="nn">
                                    <link role="property" roleId="tp25.1138056395725" targetNodeId="tazn.8117425987504225408" resolveInfo="hours" />
                                  </node>
                                </node>
                              </node>
                              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="8117425987506243010" nodeInfo="nn">
                                <property name="value" nameId="tpee.1070475926801" value=":" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="content" roleId="iuxj.1622293396948928802" type="iuxj.XmlElement" typeId="iuxj.6666499814681415858" id="8117425987506316480" nodeInfo="ng">
                <property name="tagName" nameId="iuxj.6666499814681415862" value="td" />
                <node role="content" roleId="iuxj.1622293396948928802" type="iuxj.XmlText" typeId="iuxj.1622293396948952339" id="8117425987506328213" nodeInfo="nn">
                  <property name="value" nameId="iuxj.1622293396948953704" value="123" />
                  <node role="smodelAttribute" roleId="tpck.5169995583184591170" type="tpf8.PropertyMacro" typeId="tpf8.1087833241328" id="8117425987506328215" nodeInfo="nn">
                    <property name="propertyName" nameId="tpck.1757699476691236117" value="value" />
                    <node role="propertyValueFunction" roleId="tpf8.1167756362303" type="tpf8.PropertyMacro_GetPropertyValue" typeId="tpf8.1167756080639" id="8117425987506328216" nodeInfo="nn">
                      <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="8117425987506328217" nodeInfo="sn">
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="8117425987506328910" nodeInfo="nn">
                          <node role="expression" roleId="tpee.1068580123156" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="8117425987506350222" nodeInfo="nn">
                            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="8117425987506350227" nodeInfo="nn">
                              <property name="value" nameId="tpee.1070475926801" value="" />
                            </node>
                            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8117425987506329353" nodeInfo="nn">
                              <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="8117425987506328909" nodeInfo="nn" />
                              <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="8117425987506340245" nodeInfo="nn">
                                <link role="property" roleId="tp25.1138056395725" targetNodeId="tazn.8117425987503708298" resolveInfo="inRoom" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="content" roleId="iuxj.1622293396948928802" type="iuxj.XmlElement" typeId="iuxj.6666499814681415858" id="8117425987506366554" nodeInfo="ng">
                <property name="tagName" nameId="iuxj.6666499814681415862" value="td" />
                <node role="content" roleId="iuxj.1622293396948928802" type="iuxj.XmlText" typeId="iuxj.1622293396948952339" id="8117425987506388734" nodeInfo="nn">
                  <property name="value" nameId="iuxj.1622293396948953704" value="presenter" />
                  <node role="smodelAttribute" roleId="tpck.5169995583184591170" type="tpf8.PropertyMacro" typeId="tpf8.1087833241328" id="8117425987506389174" nodeInfo="nn">
                    <property name="propertyName" nameId="tpck.1757699476691236117" value="value" />
                    <node role="propertyValueFunction" roleId="tpf8.1167756362303" type="tpf8.PropertyMacro_GetPropertyValue" typeId="tpf8.1167756080639" id="8117425987506389175" nodeInfo="nn">
                      <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="8117425987506389176" nodeInfo="sn">
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="8117425987506389869" nodeInfo="nn">
                          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8117425987506390312" nodeInfo="nn">
                            <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="8117425987506389868" nodeInfo="nn" />
                            <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="8117425987506401204" nodeInfo="nn">
                              <link role="property" roleId="tp25.1138056395725" targetNodeId="tazn.8117425987503708329" resolveInfo="presenter" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="smodelAttribute" roleId="tpck.5169995583184591170" type="tpf8.LoopMacro" typeId="tpf8.1118786554307" id="8117425987505942465" nodeInfo="nn">
                <node role="sourceNodesQuery" roleId="tpf8.1167952069335" type="tpf8.SourceSubstituteMacro_SourceNodesQuery" typeId="tpf8.1167951910403" id="8117425987505942467" nodeInfo="nn">
                  <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="8117425987505942469" nodeInfo="sn">
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="8117425987505944133" nodeInfo="nn">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8117425987505955344" nodeInfo="nn">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8117425987505944486" nodeInfo="nn">
                          <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="8117425987505944132" nodeInfo="nn" />
                          <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkListAccess" typeId="tp25.1138056282393" id="8117425987505947874" nodeInfo="nn">
                            <link role="link" roleId="tp25.1138056546658" targetNodeId="tazn.8117425987503702173" />
                          </node>
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tp2q.SortOperation" typeId="tp2q.1205679737078" id="8117425987505985918" nodeInfo="nn">
                          <node role="closure" roleId="tp2q.1204796294226" type="tp2c.ClosureLiteral" typeId="tp2c.1199569711397" id="8117425987505985920" nodeInfo="nn">
                            <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="8117425987505985921" nodeInfo="sn">
                              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="8117425987505987522" nodeInfo="nn">
                                <node role="expression" roleId="tpee.1068580123156" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="8117425987506031555" nodeInfo="nn">
                                  <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8117425987506054752" nodeInfo="nn">
                                    <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8117425987506047451" nodeInfo="nn">
                                      <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8117425987506036122" nodeInfo="nn">
                                        <node role="operand" roleId="tpee.1197027771414" type="tpee.VariableReference" typeId="tpee.1068498886296" id="8117425987506033662" nodeInfo="nn">
                                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="8117425987505985922" resolveInfo="it" />
                                        </node>
                                        <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="8117425987506041186" nodeInfo="nn">
                                          <link role="link" roleId="tp25.1138056516764" targetNodeId="tazn.8117425987503708283" />
                                        </node>
                                      </node>
                                      <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="8117425987506050985" nodeInfo="nn">
                                        <link role="link" roleId="tp25.1138056516764" targetNodeId="tazn.8117425987504225478" />
                                      </node>
                                    </node>
                                    <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="8117425987506058360" nodeInfo="nn">
                                      <link role="property" roleId="tp25.1138056395725" targetNodeId="tazn.8117425987504225433" resolveInfo="minutes" />
                                    </node>
                                  </node>
                                  <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.MulExpression" typeId="tpee.1092119917967" id="8117425987506010316" nodeInfo="nn">
                                    <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8117425987506004276" nodeInfo="nn">
                                      <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8117425987505997993" nodeInfo="nn">
                                        <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8117425987505988366" nodeInfo="nn">
                                          <node role="operand" roleId="tpee.1197027771414" type="tpee.VariableReference" typeId="tpee.1068498886296" id="8117425987505987521" nodeInfo="nn">
                                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="8117425987505985922" resolveInfo="it" />
                                          </node>
                                          <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="8117425987505992880" nodeInfo="nn">
                                            <link role="link" roleId="tp25.1138056516764" targetNodeId="tazn.8117425987503708283" />
                                          </node>
                                        </node>
                                        <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="8117425987506000973" nodeInfo="nn">
                                          <link role="link" roleId="tp25.1138056516764" targetNodeId="tazn.8117425987504225478" />
                                        </node>
                                      </node>
                                      <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="8117425987506007330" nodeInfo="nn">
                                        <link role="property" roleId="tp25.1138056395725" targetNodeId="tazn.8117425987504225408" resolveInfo="hours" />
                                      </node>
                                    </node>
                                    <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="8117425987506022604" nodeInfo="nn">
                                      <property name="value" nameId="tpee.1068580320021" value="1000" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="parameter" roleId="tp2c.1199569906740" type="tp2q.SmartClosureParameterDeclaration" typeId="tp2q.1203518072036" id="8117425987505985922" nodeInfo="ig">
                              <property name="name" nameId="tpck.1169194664001" value="it" />
                              <node role="type" roleId="tpee.5680397130376446158" type="tpee.UndefinedType" typeId="tpee.4836112446988635817" id="8117425987505985923" nodeInfo="in" />
                            </node>
                          </node>
                          <node role="ascending" roleId="tp2q.1205679832066" type="tp2q.SortDirection" typeId="tp2q.1178286324487" id="8117425987505985924" nodeInfo="nn">
                            <property name="value" nameId="tpee.1068580123138" value="true" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="content" roleId="iuxj.1622293396948928802" type="iuxj.XmlText" typeId="iuxj.1622293396948952339" id="8117425987505927808" nodeInfo="nn" />
        </node>
      </node>
    </node>
    <node role="smodelAttribute" roleId="tpck.5169995583184591170" type="tpf8.RootTemplateAnnotation" typeId="tpf8.1168619357332" id="8117425987505878504" nodeInfo="ng">
      <link role="applicableConcept" roleId="tpf8.1168619429071" targetNodeId="tazn.8117425987503668721" resolveInfo="Timetable" />
    </node>
  </root>
</model>

