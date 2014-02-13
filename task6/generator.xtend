package org.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.xtext.subGraphLang.Person
import org.xtext.subGraphLang.FollowRecord

class DomainmodelGenerator implements IGenerator {

override void doGenerate(Resource resource, IFileSystemAccess fsa) {

    fsa.generateFile("data.xml", 
        '''<?xml version="1.0"?>
        <persons>
        ''' 
// + resource.allContents.toIterable
// .filter(Person).map[compile].join("\n")
// + 
// ''' '''
)

}
// def compile(Person p){
// '''
// 
// «p.following.map[compile].join("\n")»
// 
// '''
// }
//

// def compile(FollowRecord f) {
// '''
// «f.person» 
// '''
// }

}