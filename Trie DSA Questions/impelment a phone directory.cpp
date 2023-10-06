// User function Template for C++

class trieNode
{
    public:
    char data;
    trieNode *children[26];
    bool isterminal;
    
    trieNode(char ch)
    {
        this->data = ch;
        for(int i = 0; i < 26; i++)
            children[i] = NULL;
            
        isterminal = false;
    }
};

class trie
{
    public:
    trieNode *root;
    int size;
    
    trie()
    {
        root = new trieNode('\0');
        size = 0;
    }
    
    void insertHelper(trieNode *root, string word)
    {
        if(word.length() == 0)
        {
            root->isterminal = true;
            size++;
            return;
        }
        
        int index = word[0] - 'a';
        trieNode *child;
        if(root->children[index] == NULL)
        {
            child = new trieNode(word[0]);
            root->children[index] = child;
        }
        else
            child = root->children[index];
        
        insertHelper(child, word.substr(1));
    }
    
    void insert(string s)
    {
        insertHelper(root, s);
    }
    
    void storeAllWordsWithPrefix(trieNode *root, vector<string> &ans, string word)
    {
        if(root->isterminal)
        {
            ans.push_back(word);
        }
        
        for(int i = 0; i < 26; i++)
        {
            if(root->children[i] != NULL)
            {
                storeAllWordsWithPrefix(root->children[i], ans, word + (root->children[i]->data));
            }
        }
    }
    
    void findWordsWithPrefix(string pre, vector<vector<string>> &ans)
    {
        trieNode *ptr = root;
        vector<string> temp;
        for(int i = 0; i < pre.length(); i++)
        {
            char c = pre[i];
            int index = c - 'a';
            
            if(ptr->children[index] == NULL)
            {
                temp.push_back("0");
                ans.push_back(temp);
                return;
            }
            ptr = ptr->children[index];
        }
        storeAllWordsWithPrefix(ptr, temp, pre);
        ans.push_back(temp);
    }
};

class Solution{
public:
    vector<vector<string>> displayContacts(int n, string contact[], string s)
    {
        trie *t = new trie();
        for(int i = 0; i < n; i++)
        {
            t->insert(contact[i]);
        }
        
        vector<vector<string>> ans;
        for(int i = 1; i <= s.length(); i++)
        {
            t->findWordsWithPrefix(s.substr(0, i), ans);
        }
        return ans;
    }
};