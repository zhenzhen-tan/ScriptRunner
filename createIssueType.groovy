import com.atlassian.jira.component.ComponentAccessor
import com.atlassian.jira.config.IssueTypeManager

IssueTypeManager issueTypeManager = ComponentAccessor.getComponent(IssueTypeManager)

// Get all the existing avatar id
// issueTypeManager.getIssueTypes()*.avatar*.id
issueTypeManager.createIssueType("Risk", "This is a risk", 10308)
issueTypeManager.getIssueTypes()*.name
