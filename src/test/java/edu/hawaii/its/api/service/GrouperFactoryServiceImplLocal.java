package edu.hawaii.its.api.service;

import com.sun.xml.internal.fastinfoset.tools.FI_DOM_Or_XML_DOM_SAX_SAXEvent;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import edu.hawaii.its.api.type.Group;
import edu.hawaii.its.api.type.Grouping;
import edu.hawaii.its.api.type.Person;

import edu.internet2.middleware.grouperClient.ws.StemScope;
import edu.internet2.middleware.grouperClient.ws.beans.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("GrouperFactoryService")
@Profile(value = {"default", "dev", "localTest"})
public class GrouperFactoryServiceImplLocal implements GrouperFactoryService {

    @Value("${groupings.api.settings}")
    private String SETTINGS;

    @Value("${groupings.api.grouping_admins}")
    private String GROUPING_ADMINS;

    @Value("${groupings.api.grouping_apps}")
    private String GROUPING_APPS;

    @Value("${groupings.api.grouping_owners}")
    private String GROUPING_OWNERS;

    @Value("${groupings.api.grouping_superusers}")
    private String GROUPING_SUPERUSERS;

    @Value("${groupings.api.attributes}")
    private String ATTRIBUTES;

    @Value("${groupings.api.for_groups}")
    private String FOR_GROUPS;

    @Value("${groupings.api.for_memberships}")
    private String FOR_MEMBERSHIPS;

    @Value("${groupings.api.last_modified}")
    private String LAST_MODIFIED;

    @Value("${groupings.api.yyyymmddThhmm}")
    private String YYYYMMDDTHHMM;

    @Value("${groupings.api.uhgrouping}")
    private String UHGROUPING;

    @Value("${groupings.api.destinations}")
    private String DESTINATIONS;

    @Value("${groupings.api.listserv}")
    private String LISTSERV;

    @Value("${groupings.api.trio}")
    private String TRIO;

    @Value("${groupings.api.self_opted}")
    private String SELF_OPTED;

    @Value("${groupings.api.anyone_can}")
    private String ANYONE_CAN;

    @Value("${groupings.api.opt_in}")
    private String OPT_IN;

    @Value("${groupings.api.opt_out}")
    private String OPT_OUT;

    @Value("${groupings.api.basis}")
    private String BASIS;

    @Value("${groupings.api.basis_plus_include}")
    private String BASIS_PLUS_INCLUDE;

    @Value("${groupings.api.exclude}")
    private String EXCLUDE;

    @Value("${groupings.api.include}")
    private String INCLUDE;

    @Value("${groupings.api.owners}")
    private String OWNERS;

    @Value("${groupings.api.assign_type_group}")
    private String ASSIGN_TYPE_GROUP;

    @Value("${groupings.api.assign_type_immediate_membership}")
    private String ASSIGN_TYPE_IMMEDIATE_MEMBERSHIP;

    @Value("${groupings.api.subject_attribute_name_uuid}")
    private String SUBJECT_ATTRIBUTE_NAME_UID;

    @Value("${groupings.api.operation_assign_attribute}")
    private String OPERATION_ASSIGN_ATTRIBUTE;

    @Value("${groupings.api.operation_remove_attribute}")
    private String OPERATION_REMOVE_ATTRIBUTE;

    @Value("${groupings.api.operation_replace_values}")
    private String OPERATION_REPLACE_VALUES;

    @Value("${groupings.api.privilege_opt_out}")
    private String PRIVILEGE_OPT_OUT;

    @Value("${groupings.api.privilege_opt_in}")
    private String PRIVILEGE_OPT_IN;

    @Value("${groupings.api.every_entity}")
    private String EVERY_ENTITY;

    @Value("${groupings.api.is_member}")
    private String IS_MEMBER;

    @Value("${groupings.api.success}")
    private String SUCCESS;

    @Value("${groupings.api.failure}")
    private String FAILURE;

    @Value("${groupings.api.success_allowed}")
    private String SUCCESS_ALLOWED;

    @Value("$groupings.api.stem}")
    private String STEM;

    @Value("${groupings.api.test.username}")
    private String USERNAME;

    @Value("${groupings.api.test.name}")
    private String NAME;

    @Value("${groupings.api.test.uuid}")
    private String UUID;

    @Autowired
    private GroupingRepository groupingRepository;

    @Autowired
    private GroupRepository groupRepository;

    @Autowired
    private PersonRepository personRepository;

    public GrouperFactoryServiceImplLocal() {

    }

    @Override
    public WsGroupSaveResults addEmptyGroup(String username, String path) {
        //TODO
//        WsGroupToSave groupToSave = new WsGroupToSave();
//        WsGroup group = new WsGroup();
//        group.setName(path);
//        groupToSave.setWsGroup(group);
//
//        WsSubjectLookup lookup = makeWsSubjectLookup(username);
//
//        return new GcGroupSave().addGroupToSave(groupToSave).assignActAsSubject(lookup).execute();
        throw new NotImplementedException();
    }

    /**
     * @param username: username of user to be looked up
     * @return a WsSubjectLookup with username as the subject identifier
     */
    @Override
    public WsSubjectLookup makeWsSubjectLookup(String username) {
        WsSubjectLookup wsSubjectLookup = new WsSubjectLookup();
        wsSubjectLookup.setSubjectIdentifier(username);

        return wsSubjectLookup;
    }

    /**
     * @param group: group to be looked up
     * @return a WsGroupLookup with group as the group name
     */
    @Override
    public WsGroupLookup makeWsGroupLookup(String group) {
        WsGroupLookup groupLookup = new WsGroupLookup();
        groupLookup.setGroupName(group);

        return groupLookup;
    }

    @Override
    public WsStemLookup makeWsStemLookup(String stemName, String stemUuid) {
        return new WsStemLookup(stemName, stemUuid);
    }

    @Override
    public WsStemSaveResults makeWsStemSaveResults(String username, String stemPath) {
        //TODO
//        WsStemToSave stemToSave = new WsStemToSave();
//        WsStem stem = new WsStem();
//        stem.setName(stemPath);
//        stemToSave.setWsStem(stem);
//        WsSubjectLookup subject = makeWsSubjectLookup(username);
//        return new GcStemSave().addStemToSave(stemToSave).assignActAsSubject(subject).execute();
        throw new NotImplementedException();
    }

    @Override
    public WsAttributeAssignValue makeWsAttributeAssignValue(String time) {
        //TODO

        WsAttributeAssignValue dateTimeValue = new WsAttributeAssignValue();
        dateTimeValue.setValueSystem(time);

        return dateTimeValue;
    }

    @Override
    public WsAddMemberResults makeWsAddMemberResults(String group, WsSubjectLookup lookup, String newMember) {
        //TODO
        WsAddMemberResults wsAddMemberResults = new WsAddMemberResults();
        WsResultMeta wsResultMeta = new WsResultMeta();


        Grouping ownedGrouping = groupingRepository.findByOwnersPath(group);
        Person owner = personRepository.findByUsername(lookup.getSubjectIdentifier());
        Person newGroupMember = personRepository.findByUsername(newMember);

        if (ownedGrouping.getOwners().getMembers().contains(owner)) {
            wsResultMeta.setResultCode(SUCCESS);

            if (group.endsWith(EXCLUDE)) {
                ownedGrouping.getInclude().getMembers().remove(newGroupMember);

                if (ownedGrouping.getBasis().getMembers().contains(newGroupMember)) {
                    ownedGrouping.getExclude().getMembers().add(newGroupMember);

                }
            } else if (group.endsWith(INCLUDE)) {
                ownedGrouping.getExclude().getMembers().remove(newGroupMember);

                if (!(ownedGrouping.getInclude().getMembers().contains(newGroupMember) || ownedGrouping.getBasis().getMembers().contains(newGroupMember))) {
                    ownedGrouping.getInclude().getMembers().add(newGroupMember);
                }
            }
        } else {
            wsResultMeta.setResultCode(FAILURE);
        }

        return wsAddMemberResults;
    }

    @Override
    public WsAddMemberResults makeWsAddMemberResults(String group, WsSubjectLookup lookup, List<String> newMembers) {
        WsAddMemberResults wsAddMemberResults = new WsAddMemberResults();
        WsResultMeta wsResultMeta = new WsResultMeta();
        wsResultMeta.setResultCode(SUCCESS);

        for(String username : newMembers) {
           WsResultMeta wsResultMetaData = makeWsAddMemberResults(group, lookup, username).getResultMetadata();
            if (wsResultMetaData.getResultCode().equals(FAILURE)) {
                wsResultMeta = wsResultMetaData;
            }
        }

        wsAddMemberResults.setResultMetadata(wsResultMeta);

        return wsAddMemberResults;
    }

    @Override
    public WsAddMemberResults makeWsAddMemberResults(String group, String newMember) {
        //TODO
//        return new GcAddMember()
//                .addSubjectIdentifier(newMember)
//                .assignGroupName(group)
//                .execute();
        throw new NotImplementedException();
    }

    @Override
    public WsDeleteMemberResults makeWsDeleteMemberResults(String group, String memberToDelete) {
        //TODO
//        return new GcDeleteMember()
//                .addSubjectIdentifier(memberToDelete)
//                .assignGroupName(group)
//                .execute();
        throw new NotImplementedException();
    }

    @Override
    public WsDeleteMemberResults makeWsDeleteMemberResults(String group, WsSubjectLookup lookup, String memberToDelete) {
        //TODO
//        return new GcDeleteMember()
//                .assignActAsSubject(lookup)
//                .addSubjectIdentifier(memberToDelete)
//                .assignGroupName(group)
//                .execute();
        throw new NotImplementedException();
    }

    @Override
    public WsDeleteMemberResults makeWsDeleteMemberResults(String group, WsSubjectLookup lookup, List<String> membersToDelete) {
        //TODO
//        GcDeleteMember deleteMember = new GcDeleteMember();
//        deleteMember.assignActAsSubject(lookup);
//        deleteMember.assignGroupName(group);
//
//        for (String name : membersToDelete) {
//            deleteMember.addSubjectIdentifier(name);
//        }
//
//        return deleteMember.execute();
        throw new NotImplementedException();
    }


    @Override
    public WsGetAttributeAssignmentsResults makeWsGetAttributeAssignmentsResults(String assignType,
                                                                                 //TODO
                                                                                 String attributeDefNameName) {
//        return new GcGetAttributeAssignments()
//                .addAttributeDefNameName(attributeDefNameName)
//                .assignAttributeAssignType(assignType)
//                .execute();
        throw new NotImplementedException();
    }

    @Override
    public WsGetAttributeAssignmentsResults makeWsGetAttributeAssignmentsResults(String assignType,
                                                                                 //TODO
                                                                                 String attributeDefNameName0,
                                                                                 String attributeDefNameName1) {
//        return new GcGetAttributeAssignments()
//                .addAttributeDefNameName(attributeDefNameName0)
//                .addAttributeDefNameName(attributeDefNameName1)
//                .assignAttributeAssignType(assignType)
//                .execute();
        throw new NotImplementedException();
    }

    @Override
    public WsGetAttributeAssignmentsResults makeWsGetAttributeAssignmentsResults(String assignType,
                                                                                 //TODO
                                                                                 String attributeDefNameName,
                                                                                 List<String> ownerGroupNames) {

//        GcGetAttributeAssignments getAttributeAssignments = new GcGetAttributeAssignments()
//                .addAttributeDefNameName(attributeDefNameName)
//                .assignAttributeAssignType(assignType);
//
//        ownerGroupNames.forEach(getAttributeAssignments::addOwnerGroupName);
//
//        return getAttributeAssignments.execute();
        throw new NotImplementedException();
    }

    @Override
    public WsGetAttributeAssignmentsResults makeWsGetAttributeAssignmentsResults(String assignType,
                                                                                 //TODO
                                                                                 String attributeDefNameName0,
                                                                                 String attributeDefNameName1,
                                                                                 List<String> ownerGroupNames) {

//        GcGetAttributeAssignments getAttributeAssignments = new GcGetAttributeAssignments()
//                .addAttributeDefNameName(attributeDefNameName0)
//                .addAttributeDefNameName(attributeDefNameName1)
//                .assignAttributeAssignType(assignType);
//
//        ownerGroupNames.forEach(getAttributeAssignments::addOwnerGroupName);
//
//        return getAttributeAssignments.execute();
        throw new NotImplementedException();
    }

    @Override
    public WsGetAttributeAssignmentsResults makeWsGetAttributeAssignmentsResultsForMembership(String assignType,
                                                                                              //TODO
                                                                                              String attributeDefNameName,
                                                                                              String membershipId) {
//        return new GcGetAttributeAssignments()
//                .addAttributeDefNameName(attributeDefNameName)
//                .addOwnerMembershipId(membershipId)
//                .assignAttributeAssignType(assignType)
//                .execute();
        throw new NotImplementedException();
    }

    @Override
    public WsGetAttributeAssignmentsResults makeWsGetAttributeAssignmentsResultsForGroup(String assignType,
                                                                                         //TODO
                                                                                         String group) {
//        return new GcGetAttributeAssignments()
//                .addOwnerGroupName(group)
//                .assignAttributeAssignType(assignType)
//                .execute();
        throw new NotImplementedException();
    }

    @Override
    public WsGetAttributeAssignmentsResults makeWsGetAttributeAssignmentsResultsForGroup(String assignType,
                                                                                         //TODO
                                                                                         String attributeDefNameName,
                                                                                         String group) {
//        return new GcGetAttributeAssignments()
//                .addAttributeDefNameName(attributeDefNameName)
//                .addOwnerGroupName(group)
//                .assignAttributeAssignType(assignType)
//                .execute();
        throw new NotImplementedException();
    }

    @Override
    public WsHasMemberResults makeWsHasMemberResults(String group, String username) {
        //TODO

//        return new GcHasMember()
//                .assignGroupName(group)
//                .addSubjectIdentifier(username)
//                .execute();
        throw new NotImplementedException();
    }

    @Override
    public WsAssignAttributesResults makeWsAssignAttributesResults(String attributeAssignType,
                                                                   //TODO
                                                                   String attributeAssignOperation,
                                                                   String ownerGroupName,
                                                                   String attributeDefNameName,
                                                                   String attributeAssignValueOperation,
                                                                   WsAttributeAssignValue value) {

//        return new GcAssignAttributes()
//                .assignAttributeAssignType(attributeAssignType)
//                .assignAttributeAssignOperation(attributeAssignOperation)
//                .addOwnerGroupName(ownerGroupName)
//                .addAttributeDefNameName(attributeDefNameName)
//                .assignAttributeAssignValueOperation(attributeAssignValueOperation)
//                .addValue(value)
//                .execute();
        throw new NotImplementedException();
    }

    @Override
    public WsAssignAttributesResults makeWsAssignAttributesResultsForMembership(String attributeAssignType,
                                                                                //TODO
                                                                                String attributeAssignOperation,
                                                                                String attributeDefNameName,
                                                                                String ownerMembershipId) {

//        return new GcAssignAttributes()
//                .assignAttributeAssignType(attributeAssignType)
//                .assignAttributeAssignOperation(attributeAssignOperation)
//                .addAttributeDefNameName(attributeDefNameName)
//                .addOwnerMembershipId(ownerMembershipId)
//                .execute();
        throw new NotImplementedException();
    }


    @Override
    public WsAssignAttributesResults makeWsAssignAttributesResultsForGroup(String attributeAssingType,
                                                                           //TODO
                                                                           String attributeAssignOperation,
                                                                           String attributeDefNameName,
                                                                           String ownerGroupName) {
//        return new GcAssignAttributes()
//                .assignAttributeAssignType(attributeAssingType)
//                .assignAttributeAssignOperation(attributeAssignOperation)
//                .addAttributeDefNameName(attributeDefNameName)
//                .addOwnerGroupName(ownerGroupName)
//                .execute();
        throw new NotImplementedException();
    }

    @Override
    public WsAssignAttributesResults makeWsAssignAttributesResultsForGroup(WsSubjectLookup lookup,
                                                                           //TODO
                                                                           String attributeAssingType,
                                                                           String attributeAssignOperation,
                                                                           String attributeDefNameName,
                                                                           String ownerGroupName) {
//        return new GcAssignAttributes()
//                .assignActAsSubject(lookup)
//                .assignAttributeAssignType(attributeAssingType)
//                .assignAttributeAssignOperation(attributeAssignOperation)
//                .addAttributeDefNameName(attributeDefNameName)
//                .addOwnerGroupName(ownerGroupName)
//                .execute();
        throw new NotImplementedException();
    }

    @Override
    public WsAssignGrouperPrivilegesLiteResult makeWsAssignGrouperPrivilegesLiteResult(String groupName,
                                                                                       //TODO
                                                                                       String privilegeName,
                                                                                       WsSubjectLookup lookup,
                                                                                       boolean allowed) {

//        return new GcAssignGrouperPrivilegesLite()
//                .assignGroupName(groupName)
//                .assignPrivilegeName(privilegeName)
//                .assignSubjectLookup(lookup)
//                .assignAllowed(allowed)
//                .execute();
        throw new NotImplementedException();
    }

    @Override
    public WsGetGrouperPrivilegesLiteResult makeWsGetGrouperPrivilegesLiteResult(String groupName,
                                                                                 //TODO
                                                                                 String privilegeName,
                                                                                 WsSubjectLookup lookup) {

//        return new GcGetGrouperPrivilegesLite()
//                .assignGroupName(groupName)
//                .assignPrivilegeName(privilegeName)
//                .assignSubjectLookup(lookup)
//                .execute();
        throw new NotImplementedException();
    }

    @Override
    public WsGetMembershipsResults makeWsGetMembershipsResults(String groupName,
                                                               //TODO
                                                               WsSubjectLookup lookup) {

//        return new GcGetMemberships()
//                .addGroupName(groupName)
//                .addWsSubjectLookup(lookup)
//                .execute();
        throw new NotImplementedException();
    }

    @Override
    public WsGetMembersResults makeWsGetMembersResults(String subjectAttributeName,
                                                       //TODO
                                                       WsSubjectLookup lookup,
                                                       String groupName) {

//        return new GcGetMembers()
//                .addSubjectAttributeName(subjectAttributeName)
//                .assignActAsSubject(lookup)
//                .addGroupName(groupName)
//                .assignIncludeSubjectDetail(true)
//                .execute();
        throw new NotImplementedException();
    }

    @Override
    public WsGetGroupsResults makeWsGetGroupsResults(String username,
                                                     //TODO
                                                     WsStemLookup stemLookup,
                                                     StemScope stemScope) {

//        return new GcGetGroups()
//                .addSubjectIdentifier(username)
//                .assignWsStemLookup(stemLookup)
//                .assignStemScope(stemScope)
//                .execute();
        throw new NotImplementedException();
    }

    @Override
    public WsAttributeAssign[] makeEmptyWsAttributeAssignArray() {
        //TODO
        return new WsAttributeAssign[0];
    }


    ////////////////////////////////////////////////////////////////////////////////
    // Helper methods
    ////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////

    private Group buildComposite(Group include, Group exclude, Group basis, String path) {
        Group basisPlusInclude = addIncludedMembers(include, basis);
        Group compositeGroup = removeExcludedMembers(basisPlusInclude, exclude);
        compositeGroup.setPath(path);

        return compositeGroup;
    }

    private Group addIncludedMembers(Group include, Group basis) {
        Group unionGroup = new Group();
        List<Person> unionList = new ArrayList<>();
        unionList.addAll(include.getMembers());
        unionList.addAll(basis.getMembers());

        //remove duplicates
        Set<Person> s = new TreeSet<>();
        s.addAll(unionList);
        unionGroup.setMembers(Arrays.asList(s.toArray(new Person[s.size()])));

        return unionGroup;
    }

    private Group removeExcludedMembers(Group basisPlusInclude, Group exclude) {
        Group basisPlusIncludeMinusExcludeGroup = new Group();
        ArrayList<Person> newBasisPlusInclude = new ArrayList<>();
        newBasisPlusInclude.addAll(basisPlusInclude.getMembers());

        for (Person person : exclude.getMembers()) {
            newBasisPlusInclude.remove(person);
        }
        basisPlusIncludeMinusExcludeGroup.setMembers(newBasisPlusInclude);

        return basisPlusIncludeMinusExcludeGroup;
    }
}